package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MentorTime {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String timing;
	
	@ManyToOne
	@JoinColumn(name="mentorname")
	private Mentor mentorname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public Mentor getMentorname() {
		return mentorname;
	}

	public void setMentorname(Mentor mentorname) {
		this.mentorname = mentorname;
	}
	
	
	
	


}
