import java.util.Scanner;
class NotEligibleException extends Exception
{
	
}
public class ThrowsProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age:");
		int age=sc.nextInt();
		sc.close();
		try {
			electionAge(age);
		} catch (NotEligibleException e) {
			System.out.println(e);
//			e.printStackTrace();
		}
		
	}
	public static void electionAge(int age) throws NotEligibleException
	{
		if (age>=18) {
			System.out.println("Elgible For age");
		} else {
			throw new NotEligibleException();
		}
	}

}
