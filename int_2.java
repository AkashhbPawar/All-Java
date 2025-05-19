package InterviewProgram;

import java.util.Scanner;

public class int_2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		double squ=Math.sqrt(num);
		if(num%squ==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}

}
