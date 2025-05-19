package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class even_odd_array 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		int[] b=new int[4];
		int[] c=new int[a.length+b.length];
		
		System.out.println("enter the number a");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the number b");
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
			c[i+a.length]=b[i];
		}
		
		ArrayList a1=new ArrayList<>();
		ArrayList a2=new ArrayList<>();

		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]%2==0)
			{
				a1.add(c[i]);
			}
			else
			{
				a2.add(c[i]);
			}
		}
		
		System.out.println("even number");
		System.out.println(a1);
		System.out.println("odd number");
		System.out.println(a2);
		
	}

}
