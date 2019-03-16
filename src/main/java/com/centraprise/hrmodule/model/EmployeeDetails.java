package com.centraprise.hrmodule.model;

import java.util.Date;

public class EmployeeDetails {

	private int employeeNumber;
	private String employeeName;
	private String sex;
	private Date dateOfBirth;
	private String panNumber;
	private String maritalStatus;
	private String emailAddress;
	private String phoneNumber;

	private EmployeeAddress address;

	private AssignmentInformation assignmentInfo;

	private BankInformation bankInfo;

	private ProvidentFundInformation providentINfo;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	public AssignmentInformation getAssignmentInfo() {
		return assignmentInfo;
	}

	public void setAssignmentInfo(AssignmentInformation assignmentInfo) {
		this.assignmentInfo = assignmentInfo;
	}

	public BankInformation getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInformation bankInfo) {
		this.bankInfo = bankInfo;
	}

	public ProvidentFundInformation getProvidentINfo() {
		return providentINfo;
	}

	public void setProvidentINfo(ProvidentFundInformation providentINfo) {
		this.providentINfo = providentINfo;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", sex=" + sex
				+ ", dateOfBirth=" + dateOfBirth + ", panNumber=" + panNumber + ", maritalStatus=" + maritalStatus
				+ ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", assignmentInfo=" + assignmentInfo + ", bankInfo=" + bankInfo + ", providentINfo=" + providentINfo
				+ "]";
	}

}
