package String;

import java.util.Scanner;

public class countOvels 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		int count=0;
		
		System.out.println("print ovels");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(ch[i]);
				count++;
			}
		}
		System.out.println("count of ovels");
		System.out.println(count);
		
	}

}
