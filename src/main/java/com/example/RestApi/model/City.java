package com.example.RestApi.model;

public class City {
	private int id;
	private String cityName;
	private int stateId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public City(int id, String cityName, int stateId) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.stateId = stateId;
	}

	public City() {
	}
}
