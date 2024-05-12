import java.util.Stack;

public class StackAccessElementsinLIFO {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push('a');
		stack.push(1);
		stack.push("Aarya");
		stack.push(33.4);
		stack.push(true);
		
		while(!stack.empty())
		{
			System.out.println(stack.pop());
		}

	}

}
