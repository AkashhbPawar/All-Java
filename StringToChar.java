package String;

import java.util.Scanner;

public class StringToChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		
		System.out.println(str);
		
	}

}
