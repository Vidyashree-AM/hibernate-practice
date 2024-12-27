package com.onetomany.unidirectional.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="EntityA")
public class EntityA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="EntityA_name")
	private String EntityA_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="My_join_table",joinColumns = { @JoinColumn(name="Entity_A_Foriegn_key")},
	inverseJoinColumns = {@JoinColumn(name="Entity_B_Foriegn_key")})
	private List<EntityB> entityBList = new ArrayList<EntityB>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntityA_name() {
		return EntityA_name;
	}

	public void setEntityA_name(String entityA_name) {
		EntityA_name = entityA_name;
	}

	public List<EntityB> getEntityBList() {
		return entityBList;
	}

	public void setEntityBList(List<EntityB> entityBList) {
		this.entityBList = entityBList;
	}

	
}
