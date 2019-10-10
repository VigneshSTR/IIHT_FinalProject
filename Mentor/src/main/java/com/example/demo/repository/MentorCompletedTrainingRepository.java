package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MentorCompletedTraining;
import com.example.demo.model.User;
@Repository
public interface MentorCompletedTrainingRepository extends CrudRepository<MentorCompletedTraining, Integer> {

	List<MentorCompletedTraining> findByUsername(User u);

}
