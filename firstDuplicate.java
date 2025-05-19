package String;

import java.util.Scanner;

public class firstDuplicate 
{
	public static void main(String[] args)
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		
		System.out.println("first duplicate element");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
					System.exit(i);
				}
			}
		}
		System.out.println("no duplicate");
	}

}
