package com.hospital.models;

import java.util.List;

public class Hospital {

	private Long id;
	private String name;
	private String city;
	private List<Ward> wards;

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

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", city=" + city + ", wards=" + wards + "]";
	}
}
