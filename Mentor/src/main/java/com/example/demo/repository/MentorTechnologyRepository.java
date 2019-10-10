package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MentorTechnology;

@Repository

public interface MentorTechnologyRepository extends CrudRepository<MentorTechnology, Integer>{

	List<MentorTechnology> findByTechnology(String technology);

}
