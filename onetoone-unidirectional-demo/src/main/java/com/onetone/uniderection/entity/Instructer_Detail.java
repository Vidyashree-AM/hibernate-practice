package com.onetone.uniderection.entity;

import javax.persistence.*;

@Entity
@Table(name="Instructer_detail")
public class Instructer_Detail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="hobby")
	private String hobby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gethobby() {
		return hobby;
	}

	public void sethobby(String hobby) {
		this.hobby = hobby;
	}
	
}
