package com.hospital.enumerations;

public enum InsuranceType {

	CNSS("CNSS", "70%", 0.7), RAMED("RAMED", "80%", 0.8), CNOPS("CNOPS", "100%", 1), NONE("No", "0%", 0);

	private String name;
	String percentage;
	double value;

	InsuranceType(String name, String percentage, double value) {
		this.name = name;
		this.percentage = percentage;
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public String getInsurance() {
		return name;
	}

}
