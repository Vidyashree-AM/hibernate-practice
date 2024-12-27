package com.onetone.uniderection.entity;

import javax.persistence.*;

@Entity
@Table(name="Instructer")
public class Instructer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instructer_detail_id")
	private Instructer_Detail inst_detail;

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

	public Instructer_Detail getInst_detail() {
		return inst_detail;
	}

	public void setInst_detail(Instructer_Detail inst_detail) {
		this.inst_detail = inst_detail;
	}
	
	
}
