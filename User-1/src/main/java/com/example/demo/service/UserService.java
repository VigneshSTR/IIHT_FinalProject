package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.UserCompletedTraining;
import com.example.demo.model.UserCurrentTraining;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserCompletedRepository;
import com.example.demo.repository.UserCurrentRepository;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserCompletedRepository usercompletedRepository;
	@Autowired
	private UserCurrentRepository usercurrentRepository;
	@Autowired
	private UserDetailsRepository userdetailsRepository;
	
	public void saveRole(Role r) {
		roleRepository.save(r);
		
	}
	public void saveUser(String username,String password) {
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		int id=1;
		Role r=roleRepository.findById(id);
		u.setRole(r);
		
		userRepository.save(u);
		
	}
	public void saveUserDetails(UserDetails u) {
		userdetailsRepository.save(u);
		
		
	}
	public List<UserCompletedTraining> searchCompleted() {
		return (List<UserCompletedTraining>) usercompletedRepository.findAll();
		
	}
	public List<UserCurrentTraining> searchCurrent() {
		return (List<UserCurrentTraining>) usercurrentRepository.findAll();
		
	}

}
