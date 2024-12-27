package com.onetoone.bidirectional.entity;

import javax.persistence.*;

@Entity
@Table(name="instructer1")
public class Instructer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="instructer" ,fetch = FetchType.LAZY)
	private Instructer_detail inst_dtl;

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

	public Instructer_detail getInst_dtl() {
		return inst_dtl;
	}

	public void setInst_dtl(Instructer_detail inst_dtl) {
		this.inst_dtl = inst_dtl;
	}
	
    	
}
