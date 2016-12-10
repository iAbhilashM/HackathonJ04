package com.hackathon.dto;

public class FHelp {

	private int slNo;
	private String nameOfBank;
	private String branch;
	private String accountHolderName;
	private String ifscCode;
	private String amount;
	
	public FHelp() {
		
	}

	public FHelp(int slNo, String nameOfBank, String branch, String accountHolderName, String ifscCode, String amount) {
		super();
		this.slNo = slNo;
		this.nameOfBank = nameOfBank;
		this.branch = branch;
		this.accountHolderName = accountHolderName;
		this.ifscCode = ifscCode;
		this.amount = amount;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "fHelp [slNo=" + slNo + ", nameOfBank=" + nameOfBank + ", branch=" + branch + ", accountHolderName="
				+ accountHolderName + ", ifscCode=" + ifscCode + ", amount=" + amount + "]";
	}

	
	
	
}
