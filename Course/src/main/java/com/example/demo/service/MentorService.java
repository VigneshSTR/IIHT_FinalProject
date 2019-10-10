package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Mentor;
import com.example.demo.model.MentorTechnology;
import com.example.demo.model.MentorTime;
import com.example.demo.repository.MentorRepository;
import com.example.demo.repository.MentorTechnologyRepository;
import com.example.demo.repository.MentorTimeRepository;

@Service
public class MentorService {
	@Autowired
	private MentorTechnologyRepository mentorTechnologyRepository;
	@Autowired
	private MentorTimeRepository mentorTimeRepository;
	@Autowired
	private MentorRepository mentorRepository;
	
	
	
	public List<MentorTime> findtime(String time){
		return mentorTimeRepository.findByTiming(time);
		
	}
	public List<MentorTechnology> findtimesearch(String time){
		List<MentorTime> timing=mentorTimeRepository.findByTiming(time);
		List<MentorTechnology> tech =new ArrayList<MentorTechnology>();
		for(MentorTime t:timing) {
			tech.add(mentorTechnologyRepository.findByMentorname(t.getMentorname()));
			
			
		}
		return tech;
		
	}
	
	public List<MentorTechnology> findtechnology(String technology){
		return mentorTechnologyRepository.findByTechnology(technology);
		
	}
	
	public List<MentorTechnology>  findMentorlist(){
		return (List<MentorTechnology>) mentorTechnologyRepository.findAll();
	}
	
	
	
	public void saveTechnology(String username,String technology) {
		Mentor m=mentorRepository.findByUsername(username);
		MentorTechnology mt=new MentorTechnology();
		mt.setMentorname(m);
		mt.setTechnology(technology);
		mentorTechnologyRepository.save(mt);
	}
	public void saveTime(String username,String time) {
		Mentor m=mentorRepository.findByUsername(username);
		MentorTime mt=new MentorTime();
		mt.setMentorname(m);
		mt.setTiming(time);
		
		mentorTimeRepository.save(mt);
	}
	public Mentor findMentor(String username) {
		return mentorRepository.findByUsername(username);
	}
	

}
