package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private long amount;
	private Date date;
	@ManyToOne
	@JoinColumn(name="mentorname")
	private Mentor mentorname;
	
	
	public Mentor getMentorname() {
		return mentorname;
	}
	public void setMentorname(Mentor mentorname) {
		this.mentorname = mentorname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
