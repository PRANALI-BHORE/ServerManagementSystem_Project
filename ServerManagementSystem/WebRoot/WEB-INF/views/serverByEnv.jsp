<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
 	<%-- <form action="/sdnext/getServerByEnv.html" method="post">
 	     <label path="env" >Environment:</label>
 		 <input type="text" path="env" value="${server.env}"><br><br>
  		 <input type="submit" value="Submit">
	</form>  --%>
	
<%-- 	<form:form method="POST" action="/sdnext/getServerByEnv.html">
		<table>
			<tr>
				<td><form:label path="env"> Environment</form:label></td>
				<td><form:input path="env" value="${server.env}" /></td>
			</tr>
			<t>
			<tr>
			
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>  --%>
	
	<form method="get" action="/sdnext/getServerByEnv.html">
  <label for="env">Environment: </label>
   <input type="text" id="env" name="env" value="${server.env}"><br><br>
  <%-- <select class="form-select" aria-label="Default select example">
		<option value="${server.env}">Devlopment</option>
		<option value="${server.env}">SIT</option>
		<option value="${server.env}">UAT</option>
		<option value="${server.env}">PROD</option>
	</select>
		<br><br>  --%> 
  <input type="submit" value="Submit">
</form>

</body>
</html>