<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="background.jpg">
<img alt="" src="main-logo.png" style="width: 100px; height: 100px;">
	
	<img alt="" src="company-logo.jpg" style="width: 300px;height: 100px;border-left-width: 1px;">
	<form action="controller?action=fHelp" method="post"> 
	<table align="center" style="margin-top: 100px;">
			<input type="hidden" name="empId" value="${empId}"/>
			<tr>
				<td>Name Of Bank:</td>
				<td><input type="text" name="nameOfBank"></td>
			</tr>
			<tr>
				<td>Branch:</td>
				<td><input type="text" name="branch" /></td>
			</tr>
			<tr>
				<td>Account Holder Name:</td>
				<td><input type="text" name="accountHolderName" /></td>
			</tr>
			<tr>
				<td>IFSC Code:</td>
				<td><input type="text" name="ifscCode" /></td>
			</tr>
			<tr>
				<td>Amount:</td>
				<td><input type="text" name="amount" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
	
</body>
</html>