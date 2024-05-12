package temp;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(add(2,3));//error:duplicate method available 'add'
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static double add(int a,int b)
	{
		return a+b;
	}
}
