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

import com.example.demo.model.Mentor;
import com.example.demo.model.MentorCompletedTraining;
import com.example.demo.model.MentorCurrentTraining;
import com.example.demo.model.MentorTechnology;
import com.example.demo.model.MentorTime;

import com.example.demo.service.MentorService;

@Controller
@CrossOrigin(origins="http://localhost:4200")
public class MainController {
	@Autowired
	private MentorService mentorservice;
	@GetMapping("/findtime/{time}")
	public @ResponseBody List<MentorTime>  findtime(@PathVariable String time){
		
return mentorservice.findtime(time);
		

	}
	@GetMapping("/findtechnology/{technology}")
	public @ResponseBody List<MentorTechnology>  findtechnology(@PathVariable String technology){
		
return mentorservice.findtechnology(technology);
		

	}
	@GetMapping("/findmentor/{username}")
	public @ResponseBody Mentor findMentor(@PathVariable String username) {
		return mentorservice.findMentor(username);
	}
	
	@PostMapping("/save")
	public @ResponseBody String saveMentor(@RequestBody Mentor m){
		mentorservice.saveMentorDetails(m);
		return "stored";
	}
	@PostMapping("/savetechnology")
	public @ResponseBody String savetechnology(@RequestBody MentorTechnology m){
		mentorservice.saveTechnology(m);
		return "stored";
	}
	@PostMapping("/savetime")
	public @ResponseBody String savetime(@RequestBody MentorTime m){
		mentorservice.saveTime(m);
		return "stored";
	}
	@GetMapping(path="/saveuser/{username}/{password}")
	public @ResponseBody String user(@PathVariable String username,@PathVariable String password) {
		mentorservice.saveUser(username,password);
		return "saved";
		
	}
	@GetMapping("/findcompleted/{username}")
		public @ResponseBody List<MentorCompletedTraining>  findcompleted(@PathVariable String username){
		return mentorservice.searchCompleted(username);
	}
	@GetMapping("/findcurrent/{username}")
		public @ResponseBody List<MentorCurrentTraining>  findcurrent(@PathVariable String username){
		return mentorservice.searchCurrent(username);
	}

}
