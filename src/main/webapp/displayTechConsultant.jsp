<%@page import="live.learnjava.model.TechConsultant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		TechConsultant tc = (TechConsultant) request.getAttribute("techConsultant");
	    out.print(tc);
	%>
</body>
</html>