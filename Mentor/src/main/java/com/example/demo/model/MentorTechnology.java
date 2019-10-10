package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MentorTechnology {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String technology;
	
	@ManyToOne
	@JoinColumn(name="mentorname")
	private Mentor mentorname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Mentor getMentorname() {
		return mentorname;
	}

	public void setMentorname(Mentor mentorname) {
		this.mentorname = mentorname;
	}
	
	
	
	

}
