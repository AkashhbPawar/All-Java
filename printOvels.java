package Array;

import java.util.Scanner;

public class printOvels 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] ch={'a','b','d','t','i','u'};
		
		System.out.println("enter the character");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(ch[i]);
			}
		}
		
	}

}
