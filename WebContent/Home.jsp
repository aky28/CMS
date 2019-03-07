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
<title><h1>List of flight</h1></title>
</head>
<body>
<% Service s=new Service();
ArrayList<NewsDetail> news=new ArrayList<NewsDetail>();
news=s.newsView();  
%>
	<jsp:include page="include.jsp"></jsp:include>
	<table style="float:left; margin-left: 100px;">
	<tr>
		<th>
			Headline
		</th>
		
		<th>
			News
		</th>
	</tr>
	<%//ArrayList<NewsDetail> news= (ArrayList<NewsDetail>)request.getAttribute("nlist");
	if(news!=null){
		for(NewsDetail nw : news){
	%>

			<tr>
			<td><%=nw.getHeadline()%></td>
			
			
			<td><%=nw.getText()%></td>
			</tr>
	<%}}%>
	</table>
	
</body>
</html>