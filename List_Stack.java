package Collection;

import java.util.Stack;

public class List_Stack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st=new Stack<>();
		System.out.println("push the element");
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		System.out.println("pop the element in top of stack");
		st.pop();
		System.out.println(st);
		
		System.out.println("peek the element in top of stack");
		System.out.println(st.peek());
		
	}

}
