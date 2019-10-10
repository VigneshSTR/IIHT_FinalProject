package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MentorCurrentTraining;
import com.example.demo.model.User;

@Repository
public interface MentorCurrentTrainingRepository extends CrudRepository<MentorCurrentTraining, Integer>{

	List<MentorCurrentTraining> findByUsername(User u);

}
