package Array;

import java.util.Scanner;

public class printPrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		
		System.out.println("enter the number");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println("prime number");
		for(int i=0;i<num.length;i++)
		{
			int count=0;
			for(int j=1;j<=num[i];j++)
			{
				if(num[i]%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(num[i]);
			}
		}
		
		
	}
	
}
