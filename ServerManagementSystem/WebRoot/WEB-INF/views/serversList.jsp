<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Servers</title>
</head>
<body>

	<h1>List of Servers</h1>


	<c:if test="${!empty servers}">
		<table align="left" border="1">
			<tr>
				<th>Server ID</th>
				<th>Server Name</th>
				<th>IP Address</th>
				<th>Server Type(Normal/WIP/Load Balancer)</th>
				<th>Port Number</th>
				<th>Commissioned Date</th>
				<th>isActive</th>
				<th>Usage Capacity</th>
				<th>Operating System</th>
				<th>Team</th>
				<th>Environment</th>
				<th>Application</th>
			</tr>

			<c:forEach items="${servers}" var="server">
				<tr>
					<td>${server.serverId}</td>
					<td>${server.serverName}</td>
					<td>${server.ipAddress}</td>
					<td>${server.serverType}</td>
					<td>${server.portNumber}</td>
					<td>${server.commissionedDate}</td>
					<td>${server.isActive}</td>
					<td>${server.usageCapacity}</td>
					<td>${server.operatingSystem}</td>
					<td>${server.team}</td>
					<td>${server.env}</td>
					<td>${server.application}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<a href="addd.html"><p>Add More Servers</p></a>

</body>
</html>