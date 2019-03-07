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
<title>Flight Details</title>
</head>
<body>
<% Service s=new Service();
ArrayList<FlightDetail> news=new ArrayList<FlightDetail>();
news=s.flightview();  
//ArrayList<NewsDetail> news= (ArrayList<NewsDetail>)request.getAttribute("nlist");
	if(news!=null){
		for(FlightDetail nw : news){
%>
<jsp:include page="include.jsp"></jsp:include>
<h3>
	<%= nw.getFlight_number()%>
</h3>
<table style="float:left; margin-left: 100px;">
</body>
<%}} %>
</html>