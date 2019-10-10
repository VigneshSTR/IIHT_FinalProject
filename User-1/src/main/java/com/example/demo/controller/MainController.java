package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.UserCompletedTraining;
import com.example.demo.model.UserCurrentTraining;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.UserService;

@Controller    
@CrossOrigin(origins="http://localhost:4200")  
public class MainController {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleRepository roleRepository;
	@PostMapping(path="/role")
	public @ResponseBody String role(@RequestBody Role r) {
		userService.saveRole(r);
		return "saved";
		
	}
	@GetMapping(path="/user/{username}/{password}")
	public @ResponseBody String user(@PathVariable String username,@PathVariable String password) {
		
		userService.saveUser(username,password);
		return "saved";
		
	}
	@GetMapping("/findcompleted")
	public @ResponseBody List<UserCompletedTraining>  findcompleted(){		
		return userService.searchCompleted();
	}
	@GetMapping("/findcurrent")
	public @ResponseBody List<UserCurrentTraining>  findcurrent(){
		return userService.searchCurrent();
	}
	@PostMapping("/save")
	public @ResponseBody String saveUser(@RequestBody UserDetails u){
		userService.saveUserDetails(u);
		return "stored";
	}

}
