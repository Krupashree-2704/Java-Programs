class Rectangle implements Cloneable
{
	int leng=10;
	int brea=20;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class MainProgram  {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Rectangle rectangle = new Rectangle();
//		System.out.println("Before changing value:"+rectangle.leng+" "+rectangle.brea);
//		Shallow Copy
//		Rectangle rectangle1=rectangle;
//		rectangle1.leng=20;
//		rectangle1.brea=30;
//		System.out.println("After Changing value:"+rectangle.leng+" "+rectangle.brea);
//		Deep Copy
//		Rectangle recta=new Rectangle();
//		Rectangle recta2 = new Rectangle();
//		recta2.leng=recta.leng;
//		recta2.brea=recta.brea;
//		System.out.println("Rectangle :"+recta.leng+recta.brea);
//		System.out.println("Rectangle 1:"+recta2.leng+recta2.brea);
//		recta.leng=20;
//		recta.brea=40;
//		System.out.println("Rectangle:"+recta.leng+recta.brea);
//		System.out.println("Rectangle 1:"+recta2.leng+recta2.brea);
//		Shortcut for deep copy in java=>by using clone()
//		Rectangle recta=new Rectangle();
//		Rectangle recta2=(Rectangle)recta.clone();
//		System.out.println("Recta:"+recta.leng+recta.brea);
//		recta2.leng=23;
//		recta2.brea=25;
//		System.out.println("Recta1:"+recta2.leng+recta2.brea);
		

	}

}
