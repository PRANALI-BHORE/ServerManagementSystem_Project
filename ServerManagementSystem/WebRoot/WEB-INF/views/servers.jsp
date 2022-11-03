<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Servers By Filter</h1>
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
</body>
</html>