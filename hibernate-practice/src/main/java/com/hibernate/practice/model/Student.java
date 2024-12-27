package com.hibernate.practice.model;

import javax.persistence.*;

@Entity
@Table(name= "Student")
public class Student {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	public Student() {
		super();
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
