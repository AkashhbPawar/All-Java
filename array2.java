package Array;

import java.util.Scanner;

public class array2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int rows=sc.nextInt();
		System.out.println("enter colom");
		int col=sc.nextInt();
		
		int[][] numbers=new int[rows][col];
		
		System.out.println("enter the numbers");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
