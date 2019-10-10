package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mentor;
import com.example.demo.model.Payment;
import com.example.demo.model.Role;
import com.example.demo.model.Technology;
import com.example.demo.model.User;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.MentorRepository;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.TechnologyRepository;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.repository.UserRepository;

@Service
public class AdminServices {
	@Autowired
	private MentorRepository mentorRepository;
	@Autowired
    private PaymentRepository paymentRepository;
	@Autowired
   private RoleRepository roleRepository;
	@Autowired
private TechnologyRepository technologyRepository;
	@Autowired
private UserDetailsRepository userDetailsRepository;
	@Autowired
private UserRepository userRepository;
	
	 public List<Technology> findTechnology(){
		 return (List<Technology>) technologyRepository.findAll();
		 
	 }
	 public List<Payment> findPayment(){
		 return (List<Payment>) paymentRepository.findAll();
		 
	 }
	 public List<UserDetails> findUser(){
		 return (List<UserDetails>) userDetailsRepository.findAll();
		 
	 }
	 public List<Mentor> findMentor(){
		 return (List<Mentor>) mentorRepository.findAll();
		 
	 }
	 public void saveUser(String username,String password) {
			User u=new User();
			u.setUsername(username);
			u.setPassword(password);
			int id=2;
			Role r=roleRepository.findById(id);
			u.setRole(r);
			
			userRepository.save(u);
			
		}

}
