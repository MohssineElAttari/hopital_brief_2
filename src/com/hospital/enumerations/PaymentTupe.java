package com.hospital.enumerations;

public enum PaymentTupe {
	TRANSACTION("TRANSACTION"), CACH("CACH");

	private String value;

	private PaymentTupe(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
