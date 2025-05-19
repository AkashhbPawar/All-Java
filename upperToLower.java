package String;

import java.util.Scanner;

public class upperToLower 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		
		System.out.println("UPPER TO LOWER");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				int a=ch[i]+32;
				System.out.print((char)a);
			}
			else
			{
				System.out.print(ch[i]);
			}
			
		}
		
	}

}
