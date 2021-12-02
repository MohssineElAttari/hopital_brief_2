package com.hospital.enumerations;

public enum OperationType {
	URGENT("URGENT"), NORMALE("NORMALE");

	private String value;

	OperationType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
