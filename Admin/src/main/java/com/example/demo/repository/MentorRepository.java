package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Mentor;

@Repository
public interface MentorRepository extends  CrudRepository<Mentor, Integer>{

}
