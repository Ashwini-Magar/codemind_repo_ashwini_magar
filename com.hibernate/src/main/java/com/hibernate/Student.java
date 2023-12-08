package com.hibernate;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	

	@Entity
		public class Student {

		private String name;
		@Id
		private int rollno;
		private String email;
			
		public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getRollno() {
				return rollno;
			}
			public void setRollno(int rollno) {
				this.rollno = rollno;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
	}


