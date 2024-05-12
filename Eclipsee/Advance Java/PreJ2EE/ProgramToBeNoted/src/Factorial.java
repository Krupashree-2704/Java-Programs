
public class Factorial {
	
	public static void main(String[] args) {
//		int facto=factorial(5);
//		System.out.println(facto);
		factorial('a');

	}
	public static void factorial(char a)
	{
		
//		if (i==0||i==1) {
//			return 1;
//		}
//		else
//		{
//			return fact*i;
//		}
		if (a<='z') {
			System.out.println(a);
			a++;
			factorial(a);
		}
		
	}

}
