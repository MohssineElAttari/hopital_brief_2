package com.hospital.models;

import java.util.List;

public class Ward {

	private Long id;
	private String name;
	private List<Operation> operations;

	public Ward(String name, List<Operation> operations) {
		super();
		this.id = 1L + (long) (Math.random() * (10L - 1L));
		this.name = name;
		this.operations = operations;
	}

	public Ward() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "Ward [id=" + id + ", name=" + name + ", operations=" + operations + "]";
	}

}
