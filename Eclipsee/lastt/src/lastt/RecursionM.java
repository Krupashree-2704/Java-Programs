package lastt;

public class RecursionM {

	public static void main(String[] args) {
		even('a');

	}

	public static void even(char ch) {
		if(ch<='z')
		{
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
			System.out.println(ch);
			}
			ch++;
			even(ch);
		}
		
		
	}

}
