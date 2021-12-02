package com.hospital.models;

import java.util.List;

public class Doctor extends Person {

	private String professionNumber;
	private TimeSlot shiftSlot;
	private double salary;
	private boolean worksNightShift;
	private int numberOfYearsAtHospital;
	private List<Operation> operations;

	public Doctor(String professionNumber, TimeSlot shiftSlot, double salary, boolean worksNightShift,
			int numberOfYearsAtHospital, List<Operation> operations) {
		super();
		this.professionNumber = professionNumber;
		this.shiftSlot = shiftSlot;
		this.salary = salary;
		this.worksNightShift = worksNightShift;
		this.numberOfYearsAtHospital = numberOfYearsAtHospital;
		this.operations = operations;
	}

	public Doctor() {
		super();
	}

	public String getProfessionNumber() {
		return professionNumber;
	}

	public void setProfessionNumber(String professionNumber) {
		this.professionNumber = professionNumber;
	}

	public TimeSlot getShiftSlot() {
		return shiftSlot;
	}

	public void setShiftSlot(TimeSlot shiftSlot) {
		this.shiftSlot = shiftSlot;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isWorksNightShift() {
		return worksNightShift;
	}

	public void setWorksNightShift(boolean worksNightShift) {
		this.worksNightShift = worksNightShift;
	}

	public int getNumberOfYearsAtHospital() {
		return numberOfYearsAtHospital;
	}

	public void setNumberOfYearsAtHospital(int numberOfYearsAtHospital) {
		this.numberOfYearsAtHospital = numberOfYearsAtHospital;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "Doctor [professionNumber=" + professionNumber + ", shiftSlot=" + shiftSlot + ", salary=" + salary
				+ ", worksNightShift=" + worksNightShift + ", numberOfYearsAtHospital=" + numberOfYearsAtHospital
				+ ", operations=" + operations + "]";
	}

}
