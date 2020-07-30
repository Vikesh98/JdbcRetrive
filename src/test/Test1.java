package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test1 {

	public static void main(String[] args) 
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1998");
	
		Statement s=con.createStatement();
		// retriving from table name vikesh
		
		String qry="select * from vikesh";    
		ResultSet rs=s.executeQuery(qry);

		
		/*	if(rs!=null)
		{
			System.out.println("something");
		}
	*/
		
		while (rs.next())
		{
			
		
		/*
			int id=rs.getInt("empid");
			String name=rs.getString("empname");
			int sal=rs.getInt("empsal");
			System.out.println(id+" "+name+" "+sal);
		*/	
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
		}
		
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("got it");
	}

}