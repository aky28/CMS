package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import bean.Flight;

public class FlightDao {
	   Dao dao=new Dao();
	   Connection con;
	   PreparedStatement p;
	   ResultSet r;
	   ArrayList<Flight> cust=new ArrayList<Flight>();
	   public ArrayList<Flight> view() throws ClassNotFoundException, SQLException
	   {
		   con=dao.getConnection();
		   p=con.prepareStatement("select * from flightdetail where flight_number=?");
		   p.setString(1, "A320");
		   r=p.executeQuery();
		   if(r!=null)
			   System.out.println("result null"+r.getRow());
		   else
			   System.out.println("result");
		   while(r.next())
		   {
			  /* Flight c=new Flight();
			   c.setFlightnumber(r.getString(12));*/
			   System.out.println(r.getString(11));
			  // String flightnumber(c.getFlightnumber());
			 //  cust.add(c);
		   }
		   return cust;
	   }
	   
}
