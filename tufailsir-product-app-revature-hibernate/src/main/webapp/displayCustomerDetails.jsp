<%@page import="com.revature.pms.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Customer details</h2>
	<%
	List<Customer> customers = (List<Customer>) session.getAttribute("allCustomers");
	%>
	<table cellpadding="10" cellspacing="10">
		<th>Customer Id</th>
		<th>Customer Name</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Registration Date</th>
		<%
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
		%>
		<tr>
			<td><%=customer.getCustomerId()%></td>
			<td><%=customer.getCustomerName()%></td>
			<td><%=customer.getEmailId()%></td>
			<td><%=customer.getMobileNumber()%></td>
			<td><%=customer.getRegistrationDate()%></td>

		</tr>
		<%
		}
		%>

	</table>

	</table>
</body>
</html>