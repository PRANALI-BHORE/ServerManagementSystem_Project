<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Server Details</title>
</head>
<body>
	<h2>Add Server Data</h2>
	<form:form method="POST" action="/sdnext/savee.html">
		<table>
			<tr>
				<td><form:label path="serverId">Server ID</form:label></td>
				<td><form:input path="serverId" value="${server.serverId}"
						readonly="true" /></td>
			</tr>
			<tr>
				<td><form:label path="serverName">Server Name:</form:label></td>
				<td><form:input path="serverName" value="${server.serverName}" /></td>
			</tr>
			<tr>
			        <td><form:label path="IpAddress">IP Address:</form:label></td>
			        <td><form:input path="IpAddress" value="${server.ipAddress}"/></td>
			    </tr>
			<tr>
				<td><form:label path="serverType">Server Type(Normal/WIP/Load Balancer)</form:label></td>
				<td><form:input path="serverType" value="${server.serverType}" /></td>
			</tr>

			<tr>
				<td><form:label path="portNumber"> Port Number</form:label></td>
				<td><form:input path="portNumber" value="${server.portNumber}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="commissionedDate"> Commissioned Date</form:label></td>
				<td><form:input path="commissionedDate" value="${server.commissionedDate}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="isActive"> isActive</form:label></td>
				<td><form:input path="isActive" value="${server.isActive}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="usageCapacity"> Usage Capacity</form:label></td>
				<td><form:input path="usageCapacity" value="${server.usageCapacity}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="operatingSystem"> Operating System</form:label></td>
				<td><form:input path="operatingSystem" value="${server.operatingSystem}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="team"> Team</form:label></td>
				<td><form:input path="team" value="${server.team}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="env"> Environment</form:label></td>
				<td><form:input path="env" value="${server.env}" /></td>
			</tr>
			<tr>
			
			<tr>
				<td><form:label path="application"> Application</form:label></td>
				<td><form:input path="application" value="${server.application}" /></td>
			</tr>
			<tr>
			
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

	<c:if test="${!empty servers}">
		<h3>List of servers</h3>
		<table align="left" border="1">
			<tr>
				<th>Server ID</th>
				<th>Server Name</th>
				<th>IP Address</th>
				<th>Server Type</th>
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
					<td><c:out value="${server.serverId}" /></td>
					<td><c:out value="${server.serverName}" /></td>
					<td><c:out value="${server.ipAddress}"/></td>
					<td><c:out value="${server.serverType}" /></td>
					<td><c:out value="${server.portNumber}" /></td>
					<td><c:out value="${server.commissionedDate}" /></td>
					<td><c:out value="${server.isActive}" /></td>
					<td><c:out value="${server.usageCapacity}" /></td>
					<td><c:out value="${server.operatingSystem}" /></td>
					<td><c:out value="${server.team}" /></td>
					<td><c:out value="${server.env}" /></td>
					<td><c:out value="${server.application}" /></td>
					<%-- <td align="center"><a href="deletee.html?serverId=${serverserverId}">Delete</a></td> --%>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>