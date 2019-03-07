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
import bean.NewsDetail;

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
		ArrayList<NewsDetail> news=new ArrayList<NewsDetail>();
		try {
			cust=s.views();
			news=s.newsView();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher("Home.jsp");
		request.setAttribute("flist",cust);
		request.setAttribute("nlist",news);
		rd.forward(request, response);
	}
	

}

