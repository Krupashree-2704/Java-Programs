interface I3
{
	abstract public void i3inteface();
}
interface I4
{
	abstract public void i4interface();
}
class C13
{
	public void c13mtd()
	{
		System.out.println("Method of C13");
	}
}
class C14 extends C13 implements I3,I4{
	
	
	public void i3interface()
	{
		System.out.println("I3 Interface");
	}
	
	
	public void i4interface()
	{
		System.out.println("I4 Interface");
	}
//	Method Overriding
	public void c13mtd()
	{
		System.out.println("c13 Method in C14");
	}


//	@Override
//	public void i3inteface() {
//		// TODO Auto-generated method stub
//		
//	}

		
	
}
public class twointerfaceandoneclassextendingoneclass {

	public static void main(String[] args) {
		
		C14 ref2=new C14();
		ref2.c13mtd();
		ref2.i3interface();
		ref2.i4interface();
				
	}

}
