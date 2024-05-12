import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a:");
			int a=sc.nextInt();
			System.out.println("Enter b:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("c:"+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Execption Handled");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Input Give in Integer");
			
		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		finally {
			System.out.println("In Finally Block....");
		}
		
		
	}

}
