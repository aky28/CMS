package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	private String Driver="oracle.jdbc.OracleDriver";
	private String URL="jdbc:oracle:thin:@DESKTOP-US9KEJU:1521:XE";
	private String User="AKASH";
	private String password="akash";
    private Connection con;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(Driver);
		con=DriverManager.getConnection(URL,User,password);
    	return con;
    }
    public void closeConnection(Connection con) throws SQLException
    {
    	con.close();
    } 
}
