package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mentor;
import com.example.demo.model.MentorCompletedTraining;
import com.example.demo.model.MentorCurrentTraining;
import com.example.demo.model.MentorTechnology;
import com.example.demo.model.MentorTime;
import com.example.demo.model.Role;
import com.example.demo.model.User;

import com.example.demo.repository.MentorCompletedTrainingRepository;
import com.example.demo.repository.MentorCurrentTrainingRepository;
import com.example.demo.repository.MentorRepository;
import com.example.demo.repository.MentorTechnologyRepository;
import com.example.demo.repository.MentorTimeRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

@Service
public class MentorService {
	@Autowired
	private MentorTechnologyRepository mentorTechnologyRepository;
	@Autowired
	private MentorTimeRepository mentorTimeRepository;
	@Autowired
	private MentorRepository mentorRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MentorCompletedTrainingRepository mentorCompletedRepository;
	@Autowired
	private MentorCurrentTrainingRepository mentorCurrentRepository;
	
	
	public List<MentorTime> findtime(String time){
		return mentorTimeRepository.findByTiming(time);
		
	}
	
	public List<MentorTechnology> findtechnology(String technology){
		return mentorTechnologyRepository.findByTechnology(technology);
		
	}
	public void saveMentorDetails(Mentor m) {
		mentorRepository.save(m);
		
		
	}
	
	public void saveUser(String username,String password) {
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		int id=3;
		Role r=roleRepository.findById(id);
		u.setRole(r);
		
		userRepository.save(u);
		
	}
	public List<MentorCompletedTraining> searchCompleted(String username) {
		User u=userRepository.findByUsername(username);
		
		
		return mentorCompletedRepository.findByUsername(u);
		
	}
	public List<MentorCurrentTraining> searchCurrent(String username) {
		User u=userRepository.findByUsername(username);
		
		
		return mentorCurrentRepository.findByUsername(u);
		
	}
	
	public void saveTechnology(MentorTechnology mt) {
		mentorTechnologyRepository.save(mt);
	}
	public void saveTime(MentorTime mt) {
		mentorTimeRepository.save(mt);
	}
	public Mentor findMentor(String username) {
		return mentorRepository.findByUsername(username);
	}
	

}
