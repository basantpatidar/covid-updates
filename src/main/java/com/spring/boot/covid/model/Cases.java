package com.spring.boot.covid.model;

public class Cases {

	private String newCases;

	private Long active;
	
	private Long critical;

	private Long recovered;

	private Long total;

	public Cases() {

	}

	public Cases(String newCases, Long active, Long critical, Long recovered, Long total) {
		super();
		this.newCases = newCases;
		this.active = active;
		this.critical = critical;
		this.recovered = recovered;
		this.total = total;
	}

	public String getNewCases() {
		return newCases;
	}

	public void setNewCases(String newCases) {
		this.newCases = newCases;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public Long getCritical() {
		return critical;
	}

	public void setCritical(Long critical) {
		this.critical = critical;
	}

	public Long getRecovered() {
		return recovered;
	}

	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Cases [new="+ newCases +", active=" + active + ", critical=" + critical + ", recovered=" + recovered + ", total=" + total
				+ "]";
	}

}
