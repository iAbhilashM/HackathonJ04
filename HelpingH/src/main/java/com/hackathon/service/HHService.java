package com.hackathon.service;

import java.util.List;

import com.hackathon.dao.HHDao;
import com.hackathon.dto.FHelp;
import com.hackathon.dto.HelpDetails;
import com.hackathon.dto.NfHelp;

public class HHService {

	HHDao hhDao = new HHDao();

	public void storeInHelpDetails(HelpDetails helpDetails) {
		hhDao.storeInHelpDetails(helpDetails);
	}

	public void storeInFHelp(FHelp fHelp, String empId) {
		hhDao.storeInFHelp(fHelp, empId);

	}

	public void storeInNfHelp(NfHelp nfHelp, String empId) {
		hhDao.storeInNfHelp(nfHelp, empId);
	}

	public List<HelpDetails> getHelpingDetails() {
		
		return  hhDao.getHelpingDetails();
	}

	public List<FHelp> getFHelps() {
		return hhDao.getFHelps();
	}

	public List<NfHelp> getNfHelps() {
		return hhDao.getNfHelps();
	}

	public void theNeedful(String slNo, String type) {
		hhDao.theNeedful(slNo,type);
	}

}
