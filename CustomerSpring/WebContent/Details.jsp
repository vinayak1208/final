<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items = "${list}" var = "list1">
	<c:out value="${list1.customerId}"><br/></c:out>
	<c:out value="${list1.customerName}"><br/></c:out>
	<c:out value="${list1.customerMobile}"><br/></c:out>
	<c:out value="${list1.customerEmail}"><br/></c:out>
	<c:out value="${list1.customerDOB}"><br/></c:out>
	<a href="">Edit</a>
	<a href="">Delete</a>
	<br/>
</c:forEach>
</body>
</html>