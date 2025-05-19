package PATTERN;

public class p14 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
