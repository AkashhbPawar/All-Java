package String;

import java.util.Scanner;

public class printOvels 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		
		System.out.println("print ovels");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(ch[i]);
			}
		}
		
	}

}
