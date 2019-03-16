package com.centraprise.hrmodule.model;

import java.util.Date;

public class AssignmentInformation {

	private Date assignmentStartDate;
	private Date assignmentEndDate;
	private String job;
	private Date dateOfJoining;
	private int yearsOfService;
	private String manager;

	public Date getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(Date assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}

	public Date getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(Date assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "AssignmentInformation [assignmentStartDate=" + assignmentStartDate + ", assignmentEndDate="
				+ assignmentEndDate + ", job=" + job + ", dateOfJoining=" + dateOfJoining + ", yearsOfService="
				+ yearsOfService + ", manager=" + manager + "]";
	}

}
