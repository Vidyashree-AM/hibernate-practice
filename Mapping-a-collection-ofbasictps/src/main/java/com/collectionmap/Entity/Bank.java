package com.collectionmap.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int bank_id;
	
	@Column(name="name")
	private String bank_name;
	
	@ElementCollection
	@CollectionTable(name="Bank_contacts",joinColumns = @JoinColumn(name="bank_id"))
	private List<String> contacts = new ArrayList<String>();
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(String name)
	{
		bank_name = name;
	}

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	
	
}
