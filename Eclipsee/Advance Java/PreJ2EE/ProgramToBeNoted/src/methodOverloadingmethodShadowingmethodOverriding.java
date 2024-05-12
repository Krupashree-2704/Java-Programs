class C1
{
	public static void printMethodShadow() {
		System.out.println("MethodShadow of Superclass");
	}
	public void printMethodOverriding()
	{
		System.out.println("MethodOverride of Superclass");
	}
}
class C2 extends C1
{
	public static void printMethodShadow()
	{
		System.out.println("MethodShadow of subclass");
	}
	public void printMethodOverriding() {
		System.out.println("MethodOverride of subclass");
	}
}
public class methodOverloadingmethodShadowingmethodOverriding {

	public static void main(String[] args) {
		print(1);
		print(1,2);
//	Method Shadowing
		System.out.println("Subclass Object");
		C2 ref1=new C2();
		ref1.printMethodShadow();
		System.out.println("SuperClass Object");
		C1 ref2=new C1();
		ref2.printMethodShadow();
		System.out.println("Upcasting");
		C1 ref3=new C2();
		ref3.printMethodShadow();
		System.out.println("downCasting");
		C2 ref4=(C2)ref3;
		ref4.printMethodShadow();
//		Method Overriding
		System.out.println("Subclass Object");
		C2 ref5=new C2();
		ref5.printMethodOverriding();
		System.out.println("superclass Object");
		C1 ref6=new C1();
		ref6.printMethodOverriding();
		System.out.println("Upcasting");
		C1 ref7=new C2();
		ref7.printMethodOverriding();
		System.out.println("Downcasting");
		C2 ref8=(C2)ref7;
		ref8.printMethodOverriding();
		
	}
	public static void print(int a)
	{
		System.out.println("1 argumented method");
	}
	public static void print(int a,int b)
	{
		System.out.println("2 argumented method");
	}
	

}
