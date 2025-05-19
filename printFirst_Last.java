package Array;

import java.util.Scanner;

public class printFirst_Last 
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
		System.out.println("first number = "+num[0]);
		System.out.println("last number = "+num[size-1]);
		
		
	}

}
