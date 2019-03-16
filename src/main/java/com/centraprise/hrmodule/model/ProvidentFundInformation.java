package com.centraprise.hrmodule.model;

import java.util.Date;

public class ProvidentFundInformation {

	private String uanNumber;
	private String adharNumber;
	private String prevoiusEmployee;
	private Date dateOfLeaving;
	private Date startDate;
	private Date endDate;

	public String getUanNumber() {
		return uanNumber;
	}

	public void setUanNumber(String uanNumber) {
		this.uanNumber = uanNumber;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getPrevoiusEmployee() {
		return prevoiusEmployee;
	}

	public void setPrevoiusEmployee(String prevoiusEmployee) {
		this.prevoiusEmployee = prevoiusEmployee;
	}

	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProvidentFundInformation [uanNumber=" + uanNumber + ", adharNumber=" + adharNumber
				+ ", prevoiusEmployee=" + prevoiusEmployee + ", dateOfLeaving=" + dateOfLeaving + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
