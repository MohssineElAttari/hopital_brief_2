package com.hospital.enumerations;

public enum OperationStatus {

	INPROGRESS("INPROGRESS"), COMPLETED("COMPLETED"), NOTSTART("NOTSTART");

	private String value;

	OperationStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
