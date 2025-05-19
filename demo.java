package Collection;

import java.util.*;

public class demo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(3);
		ar.add(1);
		ar.add(2);
		ar.add(2);
		ar.size();
		System.out.println(ar);
		
		HashSet<Integer> hs=new HashSet<>(ar);
		hs.addAll(ar);
		System.out.println(hs);
		
		
		
		
		
	}

}
