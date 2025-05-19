package Practice;

import java.util.Scanner;

public class powerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("enter power");
		int power=sc.nextInt();
		int temp=1;
		
		for(int i=0;i<power;i++)
		{
			temp=temp*num;
		}
		System.out.println("power of that number");
		System.out.println(temp);
		
	}

}
