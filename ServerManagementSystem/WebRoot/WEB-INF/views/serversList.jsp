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
	<h3>
		<a href="addd.html">Add More Servers</a>
	</h3>

	<c:if test="${!empty servers}">
		<table align="left" border="1">
			<tr>
				<th>Server ID</th>
				<th>Server Name</th>
				<!-- <th>IP Address</th> -->
				<th>Server Type(Normal/WIP/Load Balancer)</th>
				<th>Port Number</th>
			</tr>

			<c:forEach items="${servers}" var="server">
				<tr>
					<td>${server.serverId}</td>
					<td>${server.serverName}</td>
					<%-- <td>${server.IpAddress}</td> --%>
					<td>${server.serverType}</td>
					<td>${server.portNumber}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>