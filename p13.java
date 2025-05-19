package PATTERN;

public class p13
{
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==6&&j==2||i==4&&j==4||i==4&&j==6||i==6&&j==8||i==8&&j==4||i==8&&j==6||i==5&&j==2||i==5&&j==4||i==5&&j==5||i==5&&j==6||i==5&&j==8||i==7&&j==2||i==7&&j==4||i==7&&j==5||i==7&&j==6||i==7&&j==8) 
				{	
					System.out.print("*");
				}
				else if(i==3&&j==5)
				{
					System.out.print("0");
				}
				else if(i==5&&j==1||i==5&&j==3)
				{
					System.out.print("1");
				}
				else if(i==5&&j==7)
				{
					System.out.print("2");
				}
				else if(i==5&&j==9)
				{
					System.out.print("3");
				}
				else if(i==7&&j==1)
				{
					System.out.print("5");
				}
				else if(i==7&&j==3)
				{
					System.out.print("8");
				}
				else if(i==7&&j==7)
				{
					System.out.print("13");
				}
				else if(i==7&&j==9)
				{
					System.out.print("21");
				}
				else if(i==9&&j==5)
				{
					System.out.print("34");
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
