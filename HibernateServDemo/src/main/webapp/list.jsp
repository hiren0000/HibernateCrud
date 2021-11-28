<%@page import="com.rebel.hiren.Dao.UserDao"%>
<%@page import="com.rebel.hiren.Beans.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Users</title>
</head>
<body>

		<%
		
				UserDao udao = new UserDao();
		  
		      List<User> list = udao.getAllUsers();
		      
		      for(User u :list)
		      {
		
		
		%>
		
		UserId:<%=u.getuId() %><br>
		UserName:<%=u.getuName() %><br>
		UserAddress:<%=u.getuAdd() %><br>
		UserPhoneNumber<%=u.getuPhone() %><br><br>

<%} %>
</body>
</html>