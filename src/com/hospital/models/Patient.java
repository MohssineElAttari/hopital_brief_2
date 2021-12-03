package com.hospital.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hospital.enumerations.InsuranceType;

public class Patient extends Person {

	private Date hospitalEntryDate;
	private String affiliationNumber;
	private InsuranceType insuranceType;
	private String cIN;
	private double wallet;
	private List<Operation> operations;

	public Patient() {
		super();
	}

	public Patient(Date hospitalEntryDate, String affiliationNumber, InsuranceType insuranceType, String cIN,
			double wallet, List<Operation> operations) {
		super();
		this.hospitalEntryDate = hospitalEntryDate;
		this.affiliationNumber = affiliationNumber;
		this.insuranceType = insuranceType;
		this.cIN = cIN;
		this.wallet = wallet;
		this.operations = operations;
	}

	public Date getHospitalEntryDate() {
		return hospitalEntryDate;
	}

	public void setHospitalEntryDate(Date hospitalEntryDate) {
		this.hospitalEntryDate = hospitalEntryDate;
	}

	public String getAffiliationNumber() {
		return affiliationNumber;
	}

	public void setAffiliationNumber(String affiliationNumber) {
		this.affiliationNumber = affiliationNumber;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getcIN() {
		return cIN;
	}

	public void setcIN(String cIN) {
		this.cIN = cIN;
	}
	
	public double getWallet() {
		return wallet;
	}
	
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "Patient [hospitalEntryDate=" + hospitalEntryDate + ", affiliationNumber=" + affiliationNumber
				+ ", insuranceType=" + insuranceType + ", cIN=" + cIN + ", wallet=" + wallet + ", operations="
				+ operations + "]";
	}



}
