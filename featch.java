package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class featch 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
		PreparedStatement ps= con.prepareStatement("select * from employee");
		
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("email"));
		System.out.println(rs.getInt("age"));
		System.out.println(rs.getString("gender"));
		System.out.println(rs.getInt("salary"));
		System.out.println("---------------------------");
		}
		
	}

}
