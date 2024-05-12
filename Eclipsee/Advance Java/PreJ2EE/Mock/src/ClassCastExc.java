class Father
{
	int f=10;
}
class Son extends Father
{
	int s=20;
}
public class ClassCastExc {

	public static void main(String[] args) {
		//error in syntax
		Son s=(Son)new Father();
		System.out.println(s.f);
		System.out.println(s.s);

	}

}
