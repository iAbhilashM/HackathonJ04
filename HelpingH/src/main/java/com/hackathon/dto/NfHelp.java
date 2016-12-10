package com.hackathon.dto;

public class NfHelp {

	private int slNo;
	private String bloodGroup;
	private String hospitalName;
	
	public NfHelp() {
		
	}

	public NfHelp(int slNo, String bloodGroup, String hospitalName) {
		super();
		this.slNo = slNo;
		this.bloodGroup = bloodGroup;
		this.hospitalName = hospitalName;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	@Override
	public String toString() {
		return "nfHelp [slNo=" + slNo + ", bloodGroup=" + bloodGroup + ", hospitalName=" + hospitalName + "]";
	}

	
	
	
	
}
