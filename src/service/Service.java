package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Flight;
import dao.FlightDao;

public class Service {

	public ArrayList<Flight> views() throws ClassNotFoundException, SQLException
	{
		FlightDao c=new FlightDao();
		return(c.view());
	}
}
