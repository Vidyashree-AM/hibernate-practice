package com.cascadetpes.entity;

import java.util.*;
import javax.persistence.*;

@Entity
@Table (name= "Person")
public class Person {
	@Id
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "Owner",cascade = CascadeType.ALL)
	private List<Phone> phones = new ArrayList<Phone>();
	
	public void addPhone(Phone phone)
	{
		phones.add(phone);
		phone.setOwner(this);
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

}
