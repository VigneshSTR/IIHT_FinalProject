package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.model.UserCompletedTraining;

@Repository
public interface UserCompletedRepository extends CrudRepository<UserCompletedTraining, Integer>{
  
}
