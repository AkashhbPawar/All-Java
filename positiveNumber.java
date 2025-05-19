package Array;

import java.util.Scanner;

public class positiveNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		int count=0;
		
		System.out.println("enter the number");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println("print positive");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0)
			{
				System.out.println(num[i]);
			}
		}
		
	}

}
