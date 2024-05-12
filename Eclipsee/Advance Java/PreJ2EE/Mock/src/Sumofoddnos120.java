
public class Sumofoddnos120 {
	static int sum=0;
	public static void main(String[] args) {
		int printSum = printSum(1);
		System.out.println(printSum);

	}
	public static int printSum(int a)
	{
		if (a<=20) {
			
			if (a%2!=0) {
				
				sum=sum+a;
			}
			a++;
			printSum(a);
		}
		return sum;
	}

}
