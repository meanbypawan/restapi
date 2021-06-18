package com.example.RestApi.model;

public class State {
	private int id;
	private String stateName;
	private int countryId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public State(int id, String stateName, int countryId) {
		super();
		this.id = id;
		this.stateName = stateName;
		this.countryId = countryId;
	}

	public State() {
	}
}
