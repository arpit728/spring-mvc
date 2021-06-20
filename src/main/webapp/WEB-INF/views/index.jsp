<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
/* 	    
String name =(String) request.getAttribute("name");
	    List<String> friends = (List<String>) request.getAttribute("friends");
	     */
	   
	%>
	
	<h3>${name}</h3>
	

	<c:forEach var = "item" items = "${friends}">
	
		<h5>${item}</h5>
	
	</c:forEach>
	
	
<%--     <h2>Hello <%=name%>!</h2>
    <h2>Friends</h2>
    
    <%
    	for(String s : friends) {
    		out.println(s);
    	}
    %>
 --%>
</body>
</html>