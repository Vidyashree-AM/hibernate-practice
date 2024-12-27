package com.onetoone.bidirectional.entity;

import javax.persistence.*;

@Entity
@Table(name="instructer_detail1")
public class Instructer_detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="hobby")
	private String Hobby;
	
	@OneToOne
	@JoinColumn(name="Instructer_id")
	private Instructer instructer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobby() {
		return Hobby;
	}

	public void setHobby(String hobby) {
		Hobby = hobby;
	}

	public Instructer getInstructer() {
		return instructer;
	}

	public void setInstructer(Instructer instructer) {
		this.instructer = instructer;
	}
	
}
