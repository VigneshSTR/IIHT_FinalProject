package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MentorTechnology;
import com.example.demo.model.MentorTime;
@Repository
public interface MentorTimeRepository extends CrudRepository<MentorTime, Integer> {

	List<MentorTime> findByTiming(String time);


}
