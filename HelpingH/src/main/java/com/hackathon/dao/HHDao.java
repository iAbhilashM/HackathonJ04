package com.hackathon.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hackathon.dto.FHelp;
import com.hackathon.dto.HelpDetails;
import com.hackathon.dto.NfHelp;
import com.hackathon.helper.DBHelper;
import com.hackathon.helper.DBHelperImpl;

public class HHDao {

	DBHelper dbHelper = new DBHelperImpl();

	public void storeInHelpDetails(HelpDetails helpDetails) {

		PreparedStatement pst = null;

		pst = dbHelper.getPreparedStatement(
				"insert into helpDetails (empId,contactNo,help,details,typeOfHelp) values(?,?,?,?,?)");
		try {
			pst.setString(1, helpDetails.getEmpId());
			pst.setString(2, helpDetails.getContactNo());
			pst.setString(3, helpDetails.getHelp());
			pst.setString(4, helpDetails.getDetails());
			pst.setString(5, helpDetails.getTypeOfHelp());

			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbHelper.closeConnection();
		}

	}

	public void storeInFHelp(FHelp fHelp, String empId) {

		ResultSet rs = null;
		try {
			rs = dbHelper.getPreparedStatement("select * from helpDetails").executeQuery();
			while (rs.next()) {
				if (rs.getString(2).equals(empId)) {
					fHelp.setSlNo(rs.getInt(1));
				}
			}

			PreparedStatement pst = null;

			pst = dbHelper.getPreparedStatement("insert into fHelp values(?,?,?,?,?,?)");

			pst.setInt(1, fHelp.getSlNo());
			pst.setString(2, fHelp.getNameOfBank());
			pst.setString(3, fHelp.getBranch());
			pst.setString(4, fHelp.getAccountHolderName());
			pst.setString(5, fHelp.getIfscCode());
			pst.setString(6, fHelp.getAmount());

			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbHelper.closeConnection();
		}

	}

	public void storeInNfHelp(NfHelp nfHelp, String empId) {

		ResultSet rs = null;
		try {
			rs = dbHelper.getPreparedStatement("select * from helpDetails").executeQuery();
			while (rs.next()) {
				if (rs.getString(2).equals(empId)) {
					nfHelp.setSlNo(rs.getInt(1));
				}
			}

			PreparedStatement pst = null;

			pst = dbHelper.getPreparedStatement("insert into nfHelp values(?,?,?)");

			pst.setInt(1, nfHelp.getSlNo());
			pst.setString(2, nfHelp.getBloodGroup());
			pst.setString(3, nfHelp.getHospitalName());

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbHelper.closeConnection();
		}
	}

	public List<HelpDetails> getHelpingDetails() {

		ResultSet rs = null;
		List<HelpDetails> details = new ArrayList<HelpDetails>();
		HelpDetails helpDetails = null;
		try {
			rs = dbHelper.getPreparedStatement("select * from helpDetails").executeQuery();
			while (rs.next()) {
				helpDetails = new HelpDetails();
				helpDetails.setSlNo(rs.getInt(1));
				helpDetails.setEmpId(rs.getString(2));
				helpDetails.setContactNo(rs.getString(3));
				helpDetails.setHelp(rs.getString(4));
				helpDetails.setDetails(rs.getString(5));
				helpDetails.setTypeOfHelp(rs.getString(6));
				
				details.add(helpDetails);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbHelper.closeConnection();
		}

		return details;
	}

	public List<FHelp> getFHelps() {
		ResultSet rs = null;
		List<FHelp> fHelps = new ArrayList<FHelp>();
		FHelp fHelp = null;
		try {
			rs = dbHelper.getPreparedStatement("select * from fHelp").executeQuery();
			while (rs.next()) {
				fHelp = new FHelp();
				fHelp.setSlNo(rs.getInt(1));
				fHelp.setNameOfBank(rs.getString(2));
				fHelp.setBranch(rs.getString(3));
				fHelp.setAccountHolderName(rs.getString(4));
				fHelp.setIfscCode(rs.getString(5));
				fHelp.setAmount(rs.getString(6));
				
				fHelps.add(fHelp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbHelper.closeConnection();
		}

		return fHelps;
	}

	public List<NfHelp> getNfHelps() {
		ResultSet rs = null;
		List<NfHelp> nfHelps = new ArrayList<NfHelp>();
		NfHelp nfHelp = null;
		try {
			rs = dbHelper.getPreparedStatement("select * from nfHelp").executeQuery();
			while (rs.next()) {
				nfHelp = new NfHelp();
				nfHelp.setSlNo(rs.getInt(1));
				nfHelp.setBloodGroup(rs.getString(2));
				nfHelp.setHospitalName(rs.getString(3));
				
				nfHelps.add(nfHelp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbHelper.closeConnection();
		}

		return nfHelps;
	}

	public void theNeedful(String slNo, String type) {
		
		if(type.equals("Financial Help")){
			PreparedStatement pstHelpDetails = dbHelper.getPreparedStatement("delete from helpDetails where slNo=?");
			PreparedStatement pstFHelp = dbHelper.getPreparedStatement("delete from fHelp where slNo=?");
			try {
				pstHelpDetails.setString(1, slNo);
				pstFHelp.setString(1, slNo);

				pstHelpDetails.executeUpdate();
				pstFHelp.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				dbHelper.closeConnection();
			}
			
		}else if(type.equals("Blood Donation")){
			PreparedStatement pstHelpDetails = dbHelper.getPreparedStatement("delete from helpDetails where slNo=?");
			PreparedStatement pstNFHelp = dbHelper.getPreparedStatement("delete from nfHelp where slNo=?");
			try {
				pstHelpDetails.setString(1, slNo);
				pstNFHelp.setString(1, slNo);

				pstHelpDetails.executeUpdate();
				pstNFHelp.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				dbHelper.closeConnection();
			}
			
		}
		
		
		
	}
}
