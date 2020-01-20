package com;

import java.sql.*;

public class InsertPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement stmt1=con.prepareStatement("insert into Employee values(?,?,?)");
			stmt1.setInt(1,5);
			stmt1.setString(2,"e");
			stmt1.setString(3, "hyd");
			int i=stmt1.executeUpdate();
			System.out.println(i+"records inserted");
			con.close(); 
		}
				catch(Exception e)
				{
					System.out.println(e);
				}
			
		
			
		}

	}

