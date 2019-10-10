package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Technology;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Integer> {

}
