package Array;

import java.util.Scanner;

public class margArray 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int[] a=new int [size];
		int[] b=new int [size];
		int[] c=new int [size+size];
		
		System.out.println("enter the number array a");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the number array b");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		
		System.out.println("Marge Array");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
	}

}