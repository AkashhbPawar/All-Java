package Collection;

import java.util.LinkedList;

public class List_LinkedList 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> ar=new ArrayList<>();
//		ar.add(100);
//		ar.add(200);
//		ar.add(300);
//		LinkedList<Integer> ll=new LinkedList<>(ar);
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll);
		
		System.out.println("add first");
		ll.addFirst(0);
		System.out.println(ll);
		
		System.out.println("add last");
		ll.addLast(6);
		System.out.println(ll);
		
		System.out.println("remove first");
		ll.removeFirst();
		System.out.println(ll);
		
		System.out.println("remove last");
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("get first");
		System.out.println(ll.getFirst());
		
		System.out.println("get last");
		System.out.println(ll.getLast());
		
		
	}

}
