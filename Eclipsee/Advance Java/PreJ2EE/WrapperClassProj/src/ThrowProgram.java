import java.util.Scanner;

class NotEligibleException extends Exception{
	
}
public class ThrowProgram {
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Age");
		int age=myInput.nextInt();
		try {
		if (age>=18) {
			System.out.println("eligible for Election");
		} else {
			throw new NotEligibleException();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
