import java.util.Scanner;

public class TryCatchFinally {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(1);
		System.out.println(12.5);
		
		try {
		
		System.out.println(10/0);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("In Finally Block");
		}
		System.out.println(12.523);
		System.out.println('a');
	}

}
