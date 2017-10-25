<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="success.obj" modelAttribute="cust">
<table align="center" border="1px">


<tr>
<td>Customer Name</td>
<td><form:input path = "customerName"/><form:errors path = "customerName"/></td>
</tr>

<tr>
<td>Customer Id</td>
<td><form:input path="customerId"/><form:errors path="customerId"/></td>
</tr>

<tr>
<td>Customer Mobile</td>
<td><form:input  path="customerMobile"/><form:errors path="customerMobile"/></td>
</tr>

<tr>
<td>Customer Email</td>
<td><form:input path="customerEmail"/><form:errors path="customerEmail"/></td>
</tr>

<tr>
<td>Customer DOB</td>
<td><form:input path="customerDOB"/><form:errors path="customerDOB"/></td>
</tr>


<tr>
<td colspan="2" align="center"><input type="submit" value="Submit"></td>
</tr>


</table>
</form:form>
</body>
</html>