<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Help!!</h3>
	
	<%
		String name = (String)request.getAttribute("name");
	%>
	
	<h5><%=name%></h5>

</body>
</html>