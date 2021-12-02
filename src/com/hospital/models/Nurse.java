package com.hospital.models;


public class Nurse extends Person {
	private String professionNumber;
	private double salary;
	private boolean worksNightShift;
	private int numberOfYearsAtHospital;

	public Nurse(String professionNumber, double salary, boolean worksNightShift, int numberOfYearsAtHospital) {
		super();
		this.professionNumber = professionNumber;
		this.salary = salary;
		this.worksNightShift = worksNightShift;
		this.numberOfYearsAtHospital = numberOfYearsAtHospital;
	}

	public String getProfessionNumber() {
		return professionNumber;
	}

	public void setProfessionNumber(String professionNumber) {
		this.professionNumber = professionNumber;
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

	@Override
	public String toString() {
		return "Nurse [professionNumber=" + professionNumber + ", salary=" + salary + ", worksNightShift="
				+ worksNightShift + ", numberOfYearsAtHospital=" + numberOfYearsAtHospital + "]";
	}

}
