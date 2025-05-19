package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
		PreparedStatement ps= con.prepareStatement("delete from employee where id=? ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id to delete the values");
		int id=sc.nextInt();
		ps.setInt(1, id);
		
		ps.executeUpdate();
		System.out.println("value is successfully deleted");
		
		
	}

}
