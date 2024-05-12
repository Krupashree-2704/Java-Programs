package com.qsp;

public class ConstructorExample {
	
	public static void main(String[] args) {
		System.out.println("Printing Subclass !!!");
		Son s=new Son();
		System.out.println(s.so);
		System.out.println(s.fa);
		System.out.println("Printing Superclass !!!");
//		Upcasting
		Father father=new Son(); 
//		Downcasting
		Son s1=(Son)father;
		System.out.println(s1.so);
		System.out.println(s1.fa);
		
	}

}
class Father
{
	int fa=100;
}
class Son extends Father
{
	int so=10;
}
//class Fruit
//{
//	int f=100;
//}
//class Mango extends Fruit
//{
//	int m=10;
//}
//class Banana extends Fruit
//{
//	int b=20;
//}
//class Appple extends Fruit
//{
//	int a=30;
//}
//class Chickoo extends Fruit
//{
//	int c=40;
//}
//


