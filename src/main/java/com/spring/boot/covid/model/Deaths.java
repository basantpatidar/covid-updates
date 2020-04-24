package com.spring.boot.covid.model;

public class Deaths {
	
	//private int newDeaths;

	private String newDeaths;
	
	private Long total;

	public Deaths() {
		
	}
	
	public Deaths(String newDeaths, Long total) {
		super();
		this.newDeaths = newDeaths;
		this.total = total;
	}
	

	public String getNewDeaths() {
		return newDeaths;
	}

	public void setNewDeaths(String newDeaths) {
		this.newDeaths = newDeaths;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Deaths [new=" + newDeaths + ", total=" + total + "]";
	}

	
	

	

}
