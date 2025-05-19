package Practice;

import java.util.Scanner;

public class sumOffactor_factorial 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		System.out.println("factor of that number");
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of that number");
		System.out.println(fact);
		
		int sum1=sum+fact;
		System.out.println("sum of factor and factorial");
		System.out.println(sum1);
		
		
		
	}

}
