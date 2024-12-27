package com.onetomany.unidirectional.Entity;

import javax.persistence.*;

@Entity
@Table(name="EntityB")
public class EntityB {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="EntityB_name")
	private String EntityB_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntityB_name() {
		return EntityB_name;
	}

	public void setEntityB_name(String entityB_name) {
		EntityB_name = entityB_name;
	}

	
}
