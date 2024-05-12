
public class PrintOddNumberFrom10to1withoutusingloop {

	public static void main(String[] args) {
		printODD(10);

	}
	public static void printODD(int i)
	{
		if (i>=0) {
			if (i%2!=0) {
				System.out.println(i);
			}
			i--;
			printODD(i);
		}
	}

}
