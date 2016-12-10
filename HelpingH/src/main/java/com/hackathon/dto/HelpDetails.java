package com.hackathon.dto;

public class HelpDetails {

	private int slNo;
	private String empId;
	private String contactNo;
	private String help;
	private String details;
	private String typeOfHelp;
	
	public HelpDetails() {
		
	}

	public HelpDetails(int slNo, String empId, String contactNo, String help, String details, String typeOfHelp) {
		super();
		this.slNo = slNo;
		this.empId = empId;
		this.contactNo = contactNo;
		this.help = help;
		this.details = details;
		this.typeOfHelp = typeOfHelp;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getTypeOfHelp() {
		return typeOfHelp;
	}

	public void setTypeOfHelp(String typeOfHelp) {
		this.typeOfHelp = typeOfHelp;
	}

	@Override
	public String toString() {
		return "helpDetails [slNo=" + slNo + ", empId=" + empId + ", contactNo=" + contactNo + ", help=" + help
				+ ", details=" + details + ", typeOfHelp=" + typeOfHelp + "]";
	}
	
	

	
	
}
