package com.spring.boot.covid.model;

public class Tests {

	private Long total;
	
	public Tests() {
		
	}
	
	public Tests(Long total) {
		super();
		this.total = total;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Tests [total=" + total + "]";
	}

	
	
	

	
}
