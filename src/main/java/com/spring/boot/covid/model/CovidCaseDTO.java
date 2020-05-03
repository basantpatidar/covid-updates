package com.spring.boot.covid.model;

public class CovidCaseDTO {

	//All POJO
	
	String country;

	String day;

	String time;

	Cases cases;

	public CovidCaseDTO(String country, String day, String time, Cases cases, Deaths deaths, Tests tests) {
		super();
		this.country = country;
		this.day = day;
		this.time = time;
		this.cases = cases;
		this.deaths = deaths;
		this.tests = tests;
	}

	public CovidCaseDTO() {

	}

	Deaths deaths;
	Tests tests;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Cases getCases() {
		return cases;
	}

	public void setCases(Cases cases) {
		this.cases = cases;
	}

	public Deaths getDeaths() {
		return deaths;
	}

	public void setDeaths(Deaths deaths) {
		this.deaths = deaths;
	}

	public Tests getTests() {
		return tests;
	}

	public void setTests(Tests tests) {
		this.tests = tests;
	}

	@Override
	public String toString() {
		return "CovidCaseDTO [country=" + country + ", day=" + day + ", time=" + time + ", cases=" + cases + ", deaths="
				+ deaths + ", tests=" + tests + "]";
	}

}
