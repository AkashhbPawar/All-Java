package Practice;

import java.util.Scanner;

public class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+isfact(rem);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("it is strong number");
		}
		else
		{
			System.out.println("it is not strong number");
		}
		
	}
	public static int isfact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		return fact;
	}

}
