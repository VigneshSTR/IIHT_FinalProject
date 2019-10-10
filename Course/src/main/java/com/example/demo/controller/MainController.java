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

import com.example.demo.model.MentorTechnology;
import com.example.demo.model.MentorTime;

import com.example.demo.service.MentorService;



@Controller
@CrossOrigin(origins="http://localhost:4200")
public class MainController {
	@Autowired
	private MentorService mentorservice;
	
	@GetMapping("/findmentorlist")
	public @ResponseBody List<MentorTechnology>  findmentorlist(){
		
		return mentorservice.findMentorlist();
				

			}
	
	@GetMapping("/findtime/{time}")
	public @ResponseBody List<MentorTime>  findtime(@PathVariable String time){
		
return mentorservice.findtime(time);
		

	}
	@GetMapping("/findtimesearch/{time}")
	public @ResponseBody List<MentorTechnology>  findtimesearch(@PathVariable String time){
		
return mentorservice.findtimesearch(time);
		

	}
	@GetMapping("/findtechnology/{technology}")
	public @ResponseBody List<MentorTechnology>  findtechnology(@PathVariable String technology){
		
return mentorservice.findtechnology(technology);
		

	}
	@GetMapping("/findmentor/{username}")
	public @ResponseBody Mentor findMentor(@PathVariable String username) {
		return mentorservice.findMentor(username);
	}
	
	
	@GetMapping("/savetechnology/{username}/{technology}")
	public @ResponseBody String savetechnology(@PathVariable String username,@PathVariable String technology){
		mentorservice.saveTechnology(username,technology);
		return "stored";
	}
	@GetMapping("/savetime/{username}/{time}")
	public @ResponseBody String savetime(@PathVariable String username,@PathVariable String time){
		mentorservice.saveTime(username,time);
		return "stored";
	}
	
	

}
