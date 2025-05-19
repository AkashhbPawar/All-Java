package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
		PreparedStatement ps= con.prepareStatement("update employee set id=?,name=?,email=?,age=?,gender=?,salary=? where id=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		ps.setInt(1, id);
		System.out.println("enter the name");
		String name=sc.next();
		ps.setString(2, name);
		System.out.println("enter the email");
		String email=sc.next();
		ps.setString(3, email);
		System.out.println("enter the age");
		int age=sc.nextInt();
		ps.setInt(4, age);
		System.out.println("enter the gender");
		String gender=sc.next();
		ps.setString(5, gender);
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		ps.setInt(6, salary);
		System.out.println("enter the id to update info");
		int id1=sc.nextInt();
		ps.setInt(7, id1);
		
		int a=ps.executeUpdate();
		if(a>0)
		{
		System.out.println("value is successfully update");
		}
		else
		{
			System.out.println("value is not update");
		}
		
	}

}
