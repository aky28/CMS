package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;
import dao.FlightDao;
import bean.Flight;

/**
 * Servlet implementation class Flightcontroller
 */
@WebServlet("/Flightcontroller")
public class Flightcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Flightcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Flight f=new Flight();
		Service s=new Service();
		FlightDao fd=new FlightDao();
		ArrayList<Flight> cust=new ArrayList<Flight>();

		/*String name=request.getParameter("name");
		String dob=request.getParameter("date");
		String password=request.getParameter("pass");
		String gender=request.getParameter("gender");
		c.setDob(dob);
		c.setGender(gender);
		c.setName(name);
		c.setPassowrd(password);
		try {
			s.Add(c);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//String fname=request.getParameter("")
		try {
			cust=s.views();
			if(cust==null){
				System.out.println("null");
			}else
			System.out.println("size:    "+cust.size());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher("include.jsp");
		request.setAttribute("flist",cust);
		rd.forward(request, response);
	}

}

