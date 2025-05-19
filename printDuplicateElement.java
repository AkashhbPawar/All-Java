package String;

import java.util.Scanner;

public class printDuplicateElement
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String[] str=new String[size];
		
		System.out.println("enter the string");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		
		System.out.println("duplicate element");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println(str[i]);
				}
			}
		}
		
	}

}
