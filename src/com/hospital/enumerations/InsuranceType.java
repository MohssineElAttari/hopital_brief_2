package com.hospital.enumerations;

public enum InsuranceType {

	CNSS("CNSS",0.7,1), RAMED("RAMED",0.8,2), CNOPS("CNOPS",1,3), NONE("NOEE",0,0);

	private String value;

	InsuranceType(String value, double d, int number) {
		
	}

	public String getValue() {
		return value;
	}

}
