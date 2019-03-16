package com.centraprise.hrmodule.model;

public class BankInformation {

	private String bankName;
	private String accountNumber;
	private String ifscCode;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "BankInformation [bankName=" + bankName + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode
				+ "]";
	}

}
