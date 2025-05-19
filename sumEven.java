package Array;

import java.util.Scanner;

public class sumEven 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		int sum=0;
		
		System.out.println("enter the number");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				sum=sum+num[i];
			}
		}
		System.out.println("sum of even number");
		System.out.println(sum);
		
	}

}
