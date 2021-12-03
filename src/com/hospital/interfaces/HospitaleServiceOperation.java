package com.hospital.interfaces;

public interface HospitaleServiceOperation {
	public void menu();

	public double checkWalet(int ref);

	public boolean checkInsurance();

	public void showAllOperation();
	
	public void addOperation();
	
	public void showAllPatients(int ref);
}
