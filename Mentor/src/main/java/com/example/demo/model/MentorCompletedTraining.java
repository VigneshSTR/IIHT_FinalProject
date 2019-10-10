package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class MentorCompletedTraining {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
		private String technology;
		private String duration;
		
		@ManyToOne()
		@JoinColumn(name="username")
		private User username;

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

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public User getUsername() {
			return username;
		}

		public void setUsername(User username) {
			this.username = username;
		}

		
		

}
