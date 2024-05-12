import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.add("Kool");
		stack.add(1);
		stack.add('a');
		stack.add(10.12);
		stack.push(true);
		System.out.println(stack.peek());
		stack.add(1,"Hat");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.empty());
		stack.clear();
		System.out.println(stack.empty());
//		stack.peek();

	}

}
