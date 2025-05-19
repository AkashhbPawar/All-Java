package Practice;

import java.util.Scanner;

public class sumFactor
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
		System.out.println("sum of factor");
		System.out.println(sum);
		
	}

}
