package com.hackathon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hackathon.dto.FHelp;
import com.hackathon.dto.HelpDetails;
import com.hackathon.dto.NfHelp;
import com.hackathon.service.HHService;

public class MainController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handler(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handler(request, response);
	}

	private void handler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		RequestDispatcher rd = null;
		HHService hhService = new HHService();
		if (action.equals("helpDetails")) {
			HelpDetails helpDetails = new HelpDetails();
			helpDetails.setEmpId(request.getParameter("empId"));
			helpDetails.setContactNo(request.getParameter("contactNo"));
			helpDetails.setDetails(request.getParameter("details"));
			helpDetails.setHelp(request.getParameter("help"));
			if (request.getParameter("help").equals("Financial Help")) {
				helpDetails.setTypeOfHelp("Financial Help");
				hhService.storeInHelpDetails(helpDetails);
				request.setAttribute("empId", helpDetails.getEmpId());
				rd = request.getRequestDispatcher("financialHelpPage.jsp");
				rd.forward(request, response);

			} else if (request.getParameter("help").equals("Blood Donation")) {
				helpDetails.setTypeOfHelp("Blood Donation");
				hhService.storeInHelpDetails(helpDetails);
				request.setAttribute("empId", helpDetails.getEmpId());
				rd = request.getRequestDispatcher("bloodDonationPage.jsp");
				rd.forward(request, response);

			} else {

				response.sendRedirect("index.jsp");
			}
		} else if (action.equals("fHelp")) {
			FHelp fHelp = new FHelp();
			String empId = request.getParameter("empId");
			fHelp.setNameOfBank(request.getParameter("nameOfBank"));
			fHelp.setBranch(request.getParameter("branch"));
			fHelp.setAccountHolderName(request.getParameter("accountHolderName"));
			fHelp.setIfscCode(request.getParameter("ifscCode"));
			fHelp.setAmount(request.getParameter("amount"));

			hhService.storeInFHelp(fHelp, empId);

			response.sendRedirect("success.jsp");
		} else if (action.equals("nfHelp")) {
			NfHelp nfHelp = new NfHelp();
			String empId = request.getParameter("empId");
			nfHelp.setBloodGroup(request.getParameter("bloodGroup"));
			nfHelp.setHospitalName(request.getParameter("hospitalName"));

			hhService.storeInNfHelp(nfHelp, empId);

			response.sendRedirect("success.jsp");
		} else if (action.equals("admin")) {
			List<HelpDetails> helpDetailsList = hhService.getHelpingDetails();
			List<FHelp> fHelps = hhService.getFHelps();
			List<NfHelp> nfHelps = hhService.getNfHelps();
			System.out.println(fHelps);
			System.out.println(nfHelps);
			request.setAttribute("helpDetailsList", helpDetailsList);
			request.setAttribute("fHelps", fHelps);
			request.setAttribute("nfHelps", nfHelps);
			rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
			
		} else if (action.equals("done")) {
			hhService.theNeedful(request.getParameter("slNo"), request.getParameter("type"));
			List<HelpDetails> helpDetailsList = hhService.getHelpingDetails();
			List<FHelp> fHelps = hhService.getFHelps();
			List<NfHelp> nfHelps = hhService.getNfHelps();

			request.setAttribute("helpDetailsList", helpDetailsList);
			request.setAttribute("fHelps", fHelps);
			request.setAttribute("nfHelps", nfHelps);
			rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
			
		}

	}

}
