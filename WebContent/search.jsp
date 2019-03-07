<%@page import="service.Service" %>
<%@page import="bean.Flight" %>
<%@page import="bean.NewsDetail" %>
<%@page import="bean.FlightDetail" %>
<%@page import="java.util.*" %>
<%@page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search and filter</title>
</head>
<body>

<jsp:include page="include.jsp"></jsp:include>
<%ArrayList<FlightDetail> f=new ArrayList<FlightDetail>();
f=(ArrayList<FlightDetail>)request.getAttribute("find"); 
if(f!=null){
		for(FlightDetail nw : f){%>
<h3>

	<%= nw.getFlight_number()%>Program

</h3>
	<table style="float:left; margin-left: 100px;">
	<tr>
		<th>
				MSN
		</th>
		
		<th>
			HL
		</th>
		<th>
			GW
		</th>
		<th>
			AP
		</th>
		<th>
			RT
		</th>
		<th>
			AIRPORT
		</th>
		<th>
			FLW
		</th>
		<th>
			FRW
		</th>
		<th>
			FQLW
		</th>
		<th>
			MA
		</th>
		
	</tr>
	
	

			<tr>
			<td><%=nw.getMsn()%></td>
			<td><%=nw.getHl()%></td>
			<td><%=nw.getGw()%></td>
			<td><%=nw.getAp()%></td>
			<td><%=nw.getRt()%></td>
			<td><%=nw.getAirport()%></td>
			<td><%=nw.getFlw()%></td>
			<td><%=nw.getFrw()%></td>
			<td><%=nw.getFqlw()%></td>
			<td><%=nw.getMa()%></td>
	
			</tr>
	<%}}%>
	</table>

<form method="post" action="SearchController">
<input type="text" name="search" id="search" placeholder="searchitem"/>
<input type="submit" name="search"/>
</form>

</body>
</html>