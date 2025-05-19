package PATTERN;

public class star 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==5||i==7||i==6&&j==2||i==4&&j==4||i==4&&j==6||i==6&&j==8||i==8&&j==4||i==8&&j==6||i==9&&j==5||i==3&&j==5) 
				{	
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
			
	}

}
