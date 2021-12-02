package com.hospital.interfaces;

import java.util.List;

import com.hospital.models.Patient;

public interface PatientInterface {
	public void getInfoPatient(int ref);

	public boolean removePatient();

	public boolean serchPatient();

	public void addPatient(List<Patient> list, Patient patient);
}
