import java.util.Iterator;
import java.util.Stack;

public class StackAcessElement {

	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.add(1);
		stack.add("Mobile");

		stack.push(23);
		stack.push(13);
		stack.push(35);
		stack.push(45);
		stack.add(3,'a');
		
		System.out.println(stack);
		
		System.out.println("Removing Elements");
		
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack);
//		Iterator itr=stack.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		while(!stack.empty())
//		{
//			System.out.println(stack.pop());
//		}
		
		stack.remove(Character.valueOf('a'));
		System.out.println(stack);
			
//		Stack stack=new Stack();
//		stack.push(1);
//		stack.push(null);
//		stack.push(10.23);
//		stack.push('a');
//		stack.push("Stack");
//		stack.push(true);
//		System.out.println(stack);
		
//		Accessing element in Backward Direction
//		for(Object obj:stack)
//		{
//			System.out.println(obj);
//		}
//		
//		Accessing Element in Forward Direction
//		while (!stack.empty()) {
//			System.out.println(stack.pop());
//		}
//		
//		To remove object:we have to convert the primitive type data into non-primitive data
//		stack.remove(Character.valueOf('a'));
//		System.out.println(stack);
//		
//		stack.remove(Double.valueOf(10.23));
//		System.out.println(stack);
		
	}

}
