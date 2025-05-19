package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class List_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<>();
		System.out.println("add element");
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		System.out.println(ar);
		
		System.out.println("get element");
		int a=ar.get(3);
		System.out.println(a);
		
		System.out.println("add center");
		ar.add(0, 0);
		System.out.println(ar);
		
		System.out.println("modify element");
		ar.set(4, 2);
		System.out.println(ar);
		
		System.out.println("delete element");
		ar.remove(0);
		System.out.println(ar);
		
		System.out.println("size of arraylist");
		System.out.println(ar.size());
		
		System.out.println("loop example");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("sorting arraylist");
		Collections.sort(ar);
		System.out.println(ar);

		
	}

}
