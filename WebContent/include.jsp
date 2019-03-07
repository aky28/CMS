<%@page import="service.Service" %>
<%@page import="bean.Flight" %>
<%@page import="bean.NewsDetail" %>
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
		<% /* session=request.getSession();
		ArrayList<NewsDetail> news=(ArrayList<NewsDetail>)request.getAttribute("nlist");
		//=new ArrayList<NewsDetail>();
		//session.setAttribute("nlist",news); */
		%>

<table style="border: 2px solid black; margin= 15px;">
<tr>
<td>
<a href="Home.jsp"><input type="button" value="Home" /></a>
</td>
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
<td>
<a href="flight.jsp?fn='<%=l.getFlightnumber()%>'"><input type="button" value='<%=l.getFlightnumber()%>' /></a>
</td>
</tr>
<%}}/* else{
	response.getWriter().print("not");}  */%>
</table>
</body>
</html>