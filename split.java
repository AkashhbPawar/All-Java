package Practice;

public class split
{
	public static void main(String[] args)
	{
		String str="name=akash,company=TDS,age=22";
		String s1=str.replace("=", ":");
		String[] s2=s1.split(",");
		for (String s3 : s2) 
		{
			System.out.println(s3);
		}
			
	}

}
