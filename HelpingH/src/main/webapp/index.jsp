<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="background.jpg">
<img alt="" src="main-logo.png" style="width: 100px; height: 100px;">
	
	<img alt="" src="company-logo.jpg" style="width: 300px;height: 100px;border-left-width: 1px;">
	<form method="post" action="controller?action=helpDetails" name="helpDetails">

		<table align="center" style="margin-top: 100px;">
			<tr>
				<td>Employee Id:</td>
				<td><input type="text" name="empId"></td>
			</tr>
			<tr>
				<td>Contact No:</td>
				<td><input type="text" name="contactNo"></td>
			</tr>
			<tr>
				<td>Help:</td>
				<td><select name="help">
						<option value="none">- Select -</option>
						<option value="Financial Help">Financial Help</option>
						<option value="Blood Donation">Blood Donation</option>
					</select>
			</tr>
			<tr>
				<td>Attachment:</td>
				<td><input type="file" name="file" size="50" /></td>
			</tr>
			<tr>
				<td>Details:</td>
				<td><input type="text" name="details"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Next"></td>
			</tr>
		</table>
	</form>

</body>
</html>