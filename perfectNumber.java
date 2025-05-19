package Practice;

import java.util.Scanner;

public class perfectNumber
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
		System.out.println("sum of this factor");
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("it is perfect number");
		}
		else
		{
			System.out.println("it is not perfect number");
		}
		
	}

}
