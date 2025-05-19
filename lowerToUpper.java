package String;

import java.util.Scanner;

public class lowerToUpper
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		
		System.out.println("LOEWR TO UPPER");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				int a=ch[i]-32;
				System.out.print((char)a);
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
		
		
	}

}
