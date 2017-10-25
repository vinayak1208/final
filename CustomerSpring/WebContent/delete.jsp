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
<form action="deleteDetail.obj">
Enter the customer Id to delete
<!-- <input type="number" name="customerId"> -->
<select name="id">
<c:forEach items="${key }" var="a">

<option><c:out value="${a}"></c:out>
</option>

</c:forEach>
</select>
<input type="submit" value="submit">
</form>
</body>
</html>