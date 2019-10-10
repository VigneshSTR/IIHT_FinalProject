package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class MentorCurrentTraining {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
		private String technology;
		private String completedduration;
		private String pendingduration;
		
		@ManyToOne
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

		public String getCompletedduration() {
			return completedduration;
		}

		public void setCompletedduration(String completedduration) {
			this.completedduration = completedduration;
		}

		public String getPendingduration() {
			return pendingduration;
		}

		public void setPendingduration(String pendingduration) {
			this.pendingduration = pendingduration;
		}

		public User getUsername() {
			return username;
		}

		public void setUsername(User username) {
			this.username = username;
		}

		
		
}
