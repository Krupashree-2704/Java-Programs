import java.util.Scanner;

public class Factorsof24 {

	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
		System.out.println("enter the value for finding it's factor");
		int factor=myInput.nextInt();
		int i=1;
		
		while (i<=factor) {
			if (factor%i==0) {
				System.out.println(i);
				
				
			}
			i++;
		}
	}

}
