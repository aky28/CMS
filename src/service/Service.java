package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Flight;
import bean.FlightDetail;
import bean.NewsDetail;
import dao.FlightDao;

public class Service {

	public ArrayList<Flight> views() throws ClassNotFoundException, SQLException
	{
		FlightDao c=new FlightDao();
		return(c.view());
	}
	 public ArrayList<NewsDetail> newsView() throws ClassNotFoundException, SQLException
	   {
		 FlightDao c=new FlightDao();
			return(c.newsView());
	   }
	 public ArrayList<FlightDetail> flightview() throws ClassNotFoundException, SQLException
	   {
		 FlightDao c=new FlightDao();
			return(c.flightview());
	   }
}
