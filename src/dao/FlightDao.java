package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




import bean.Flight;
import bean.FlightDetail;
import bean.NewsDetail;

public class FlightDao {
	   Dao dao=new Dao();
	   Connection con;
	   PreparedStatement p;
	   ResultSet r;
	   
	   public ArrayList<Flight> view() throws ClassNotFoundException, SQLException
	   {
		   ArrayList<Flight> cust=new ArrayList<Flight>();
		   con=dao.getConnection();
		   p=con.prepareStatement("select * from flightdetail");
		   r=p.executeQuery();
		 
		   while(r.next())
		   {
			   Flight c=new Flight();
			   c.setFlightnumber(r.getString(12));
			 //  System.out.println(r.getString(1));
			 //  String flightnumber(c.getFlightnumber());
			   cust.add(c);
		   }
		   return cust;
	   }
	   public ArrayList<NewsDetail> newsView() throws ClassNotFoundException, SQLException
	   {
		   ArrayList<NewsDetail> cust=new ArrayList<NewsDetail>();
		   con=dao.getConnection();
		   p=con.prepareStatement("select * from newsfeed");
		   r=p.executeQuery();
		 
		   while(r.next())
		   {
			   NewsDetail c=new NewsDetail();
			   c.setHeadline(r.getString(1));
			   c.setText(r.getString(2));
			   System.out.println(r.getString(1));
			 //  String flightnumber(c.getFlightnumber());
			   cust.add(c);
		   }
		   return cust;
	   }
	   public ArrayList<FlightDetail> flightview() throws ClassNotFoundException, SQLException
	   {
		   ArrayList<FlightDetail> cust=new ArrayList<FlightDetail>();
		   con=dao.getConnection();
		   p=con.prepareStatement("select * from flightdetail");
		   r=p.executeQuery();
		 
		   while(r.next())
		   {
			   FlightDetail c=new FlightDetail();
			   c.setMsn(Integer.parseInt(r.getString(1)));
			   c.setAp(r.getString(4));
			   c.setAirport(r.getString(6));
			   c.setHl(r.getString(2));
			   c.setGw(r.getString(3));
			   c.setRt(r.getString(5));
			   c.setFlw(r.getString(7));
			   c.setFrw(r.getString(8));
			   c.setFqlw(r.getString(9));
			   c.setMa(r.getString(10));
			   c.setFno(r.getString(11));
			   c.setFlight_number(r.getString(12));
			  // System.out.println(r.getString(1));
			 //  String flightnumber(c.getFlightnumber());
			   cust.add(c);
		   }
		   return cust;
		   
	   }
	   public ArrayList<FlightDetail> show(int num) throws ClassNotFoundException, SQLException
	   {
		   ArrayList<FlightDetail> cust=new ArrayList<FlightDetail>();
		   con=dao.getConnection();
		   p=con.prepareStatement("select * from flightdetail where msn=?");
		   p.setInt(1,num);
		   r=p.executeQuery();
		 
		   while(r.next())
		   {
			   FlightDetail c=new FlightDetail();
			   c.setMsn(Integer.parseInt(r.getString(1)));
			   c.setAp(r.getString(4));
			   c.setAirport(r.getString(6));
			   c.setHl(r.getString(2));
			   c.setGw(r.getString(3));
			   c.setRt(r.getString(5));
			   c.setFlw(r.getString(7));
			   c.setFrw(r.getString(8));
			   c.setFqlw(r.getString(9));
			   c.setMa(r.getString(10));
			   c.setFno(r.getString(11));
			   c.setFlight_number(r.getString(12));
			  // System.out.println(r.getString(1));
			 //  String flightnumber(c.getFlightnumber());
			   cust.add(c);
		   }
		   return cust;
		   
	   }	   
	   
	   
}
