package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Mentor;
import com.example.demo.model.Payment;
import com.example.demo.model.Technology;
import com.example.demo.model.UserDetails;
import com.example.demo.service.AdminServices;

@Controller
@CrossOrigin(origins="http://localhost:4200")
public class MainController {
	@Autowired
	private AdminServices adminServices;
	
	@GetMapping("/findpayment")
	public @ResponseBody List<Payment> findpayment(){
		return adminServices.findPayment();
	}
	@GetMapping("/findtechnology")
	public @ResponseBody List<Technology> findtechnology(){
		return adminServices.findTechnology();
	}
	@GetMapping("/finduser")
	public @ResponseBody List<UserDetails> finduser(){
		return adminServices.findUser();
	}
	@GetMapping("/findmentor")
	public @ResponseBody List<Mentor> findmentor(){
		return adminServices.findMentor();
	}
	
	@GetMapping(path="/user/{username}/{password}")
	public @ResponseBody String user(@PathVariable String username,@PathVariable String password) {
		
		adminServices.saveUser(username,password);
		return "saved";
		
	}

}
