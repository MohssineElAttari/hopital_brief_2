package com.hospital.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {

	private Long id;
	private String name;
	private String city;
	private List<Ward> wards;
	private List<Doctor> doctors;
	private List<Room> rooms;
	private List<Operation> operations;
	private List<Patient> patients;
	private List<Nurse> nurses;

	public Hospital() {
		super();
	}

	public Hospital(String name, String city, List<Ward> wards) {
		this.id = 1L + (long) (Math.random() * (10L - 1L));
		this.name = name;
		this.city = city;
		this.wards = wards;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Ward> getWards() {
		return wards;
	}

	public void setWards(List<Ward> wards) {
		this.wards = wards;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", city=" + city + ", wards=" + wards + "]";
	}
}
