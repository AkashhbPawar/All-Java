package Array;

import java.util.Scanner;

public class selectionSort
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
		
		System.out.println("before sorting");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("after sorting");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		
	}

}
