interface I1
{
	abstract public void i1method();
}
interface I2
{
	abstract public void i2method();
}
class C11 implements I1,I2
{
	public void i1method()
	{
		System.out.println("Method of Interface I1");
	}
	public void i2method()
	{
		System.out.println("Method of Interface I2");
	}
}
public class Achieve100percenabstraction {

	public static void main(String[] args) {
//		I1 Interface:have I1 method
//		I1 ref2=new C1();
//		ref2.i1method();
//		I2 Interface:have I2 method
//		I2 ref1=new C1();
//		ref1.i2method();
//		C1 Class :have I1 as well as I2
		C11 ref3=new C11();
		ref3.i1method();
		ref3.i2method();
	}

}
