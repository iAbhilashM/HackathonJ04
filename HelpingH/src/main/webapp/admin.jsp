<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="background.jpg">
	<img alt="" src="main-logo.png" style="width: 100px; height: 100px;">

	<img alt="" src="company-logo.jpg"
		style="width: 300px; height: 100px; border-left-width: 1px;">
	</br>
	<a href="welcome.jsp">Home</a> |
	<a href="controller?action=admin">Refresh</a>
	<c:if test="${not empty fHelps}">
		<table border="1" cellpadding="5" bgcolor="#CCCCCC">
			<tr>
				<td><h3>Sl No</h3></td>
				<td><h3>Emp Id</h3></td>
				<td><h3>Contact No.</h3></td>
				<td><h3>Help</h3></td>
				<td><h3>Details</h3></td>
				<td><h3>Name of Bank</h3></td>
				<td><h3>Branch</h3></td>
				<td><h3>Account Holder Name</h3></td>
				<td><h3>IFSC Code</h3></td>
				<td><h3>Amount</h3></td>
				<td><h3>Action</h3></td>
			</tr>
			<c:forEach items="${fHelps}" var="fHelp">
				<c:forEach items="${helpDetailsList}" var="helpDetails">
					<c:if test="${fHelp.slNo == helpDetails.slNo}">
						<tr>
							<td>${helpDetails.slNo}</td>
							<td>${helpDetails.empId}</td>
							<td>${helpDetails.contactNo}</td>
							<td>${helpDetails.help}</td>
							<td>${helpDetails.details}</td>
							<td>${fHelp.nameOfBank}</td>
							<td>${fHelp.branch}</td>
							<td>${fHelp.accountHolderName}</td>
							<td>${fHelp.ifscCode}</td>
							<td>${fHelp.amount}</td>
							<td><a
								href="controller?action=done&slNo=${helpDetails.slNo}&type=${helpDetails.typeOfHelp}">Do
									the needful.</a></td>
						</tr>
					</c:if>
				</c:forEach>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${not empty nfHelps}">
		<table border="1" cellpadding="5" bgcolor="#CCCCCC">
			<tr>
				<td><h3>Sl No</h3></td>
				<td><h3>Emp Id</h3></td>
				<td><h3>Contact No.</h3></td>
				<td><h3>Help</h3></td>
				<td><h3>Details</h3></td>
				<td><h3>Blood Group</h3></td>
				<td><h3>Hospital Name</h3></td>
				<td><h3>Action</h3></td>
			</tr>
			<c:forEach items="${nfHelps}" var="nfHelp">
				<c:forEach items="${helpDetailsList}" var="helpDetails">
					<c:if test="${nfHelp.slNo == helpDetails.slNo}">
						<tr>
							<td>${helpDetails.slNo}</td>
							<td>${helpDetails.empId}</td>
							<td>${helpDetails.contactNo}</td>
							<td>${helpDetails.help}</td>
							<td>${helpDetails.details}</td>
							<td>${nfHelp.bloodGroup}</td>
							<td>${nfHelp.hospitalName}</td>
							<td><a
								href="controller?action=done&slNo=${helpDetails.slNo}&type=${helpDetails.typeOfHelp}">Do
									the needful.</a></td>
						</tr>
					</c:if>
				</c:forEach>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>