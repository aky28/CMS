<%@page import="service.Service" %>
<%@page import="bean.Flight" %>
<%@page import="java.util.*" %>
<%@page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CMS</title>
</head>
<body>
<form action="Flightcontroller" method="post">
<input type="submit" />
</form>
<table style="border: 2px solid black;">
<tr>
<td>Home</td>
</tr>
<%
/* Service s=new Service();
ArrayList<Flight> lsp=new ArrayList<Flight>();
lsp=s.views();  */
ArrayList<Flight> flight=(ArrayList<Flight>)request.getAttribute("flist");
if(flight!=null){
for(Flight l:flight)
{%>

<tr>
<td><%=l.getFlightnumber()%></td>
</tr>
<%}}else{
	response.getWriter().print("not");} %>
</table>
</body>
</html>