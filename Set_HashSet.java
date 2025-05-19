package Collection;

import java.util.HashSet;

public class Set_HashSet
{
	public static void main(String[] args) 
	{
		//HashSet hs=new HashSet<>();
		
		HashSet<Integer> hs=new HashSet<>();
		System.out.println("add element");
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add(4);
		hs.add(4);
		hs.add(2);
		System.out.println(hs);
		
		System.out.println("search the element");
		System.out.println(hs.contains(3));
		
		System.out.println("remove the element");
		hs.remove(4);
		System.out.println(hs);
		
		System.out.println("size of element");
		System.out.println(hs.size());
		
	}

}
