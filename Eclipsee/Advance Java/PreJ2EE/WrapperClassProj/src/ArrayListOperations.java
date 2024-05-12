import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListOperations {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		System.out.println("Welcome to Abrada Company");
//		ArrayList product=new ArrayList();
		
//		To Insert records: using 4 add methods
//		product.add("Dart");
//		product.add("Bow");
//		product.add("Arrow");
//		product.add("Transformer");
//		
//		product.add(2,"Board");
//		
//		ArrayList product_ingri=new ArrayList();
//		product_ingri.add("Bajra");
//		product_ingri.add("Wheat");
//		product_ingri.add("Ragi");
//		
//		product_ingri.add(0,"Rice");
		
//		System.out.println("ArrayList of Ingidients:"+product_ingri);
//		
//		System.out.println("ArrayList of Game Products:"+product);
		
//		product.addAll(product_ingri);
		
//		System.out.println("ArrayList:"+product);
//		
//		ArrayList product_makeup=new ArrayList();
//		
//		product_makeup.add("Lipstick");
//		product_makeup.add("Maskara");
//		product_makeup.add("Highlighter");
//		product_makeup.add("Kajal");
		
//		System.out.println("ArrayLsit of Makeup Products:"+product_makeup);
		
//		product.addAll(1,product_makeup);
		
//		System.out.println("ArrayLsit :"+product);
		
//		To Remove Records: 4 methods
		
//		System.out.println("ArrayLsit product"+product);
		
//		product.remove("Board");
//		System.out.println("ArrayLsit product"+product);
//		product.remove(4);
//		System.out.println("ArrayLsit product"+product);
//		product.remove("Bajra");
//		System.out.println("ArrayLsit product"+product);
//		product.removeAll(product_makeup);
//		System.out.println("ArrayList Product"+product);
//		
//		product_ingri.clear();
//		System.out.println("Product ingri:"+product_ingri);
		
//		System.out.println(product);
//		
//		System.out.println("Searching Ragi"+product.contains("Ragi"));
//		System.out.println(product.containsAll(product_makeup));
//		
//		for (int i = 0; i <product.size(); i++) {
//			System.out.println(product.get(i));
//		}
		
		ArrayList al=new ArrayList();
		al.add("Sonal");
		al.add(true);
		al.add(10.23);
		
		al.add(1,12);
		
		ArrayList al1=new ArrayList();
		al1.add("Aarya");
		al1.add(13);
		al1.add('a');
		
//		al.addAll(al1);
		
		al.addAll(0,al1);
//		System.out.println(al1);
//		
//		System.out.println(al);
//		al.remove(10.23);
//		al.remove(Character.valueOf('a'));
		
//		al.remove()
		
//		System.out.println(al);
//		
//		System.out.println(al.contains('s'));
//		System.out.println(al.contains('a'));
//		
//		System.out.println(al1.containsAll(al));
//		System.out.println(al.containsAll(al1));
		
//		for (int i = 0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//	
//		for(Object obj:al)
//		{
//			System.out.println(obj);
//		}
//		Iterator itr=al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		ListIterator li=al.listIterator();
//		System.out.println("Forward direction");
//		while (li.hasNext()) {
//			System.out.println(li.next());
//		}
//		System.out.println("Backward Direction");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList <Integer>odd=new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			if (i%2!=0) {
				odd.add(i);
			} else {
				even.add(i);
			}
		}
		for (int i = 0; i < even.size(); i++) {
			System.out.println(even.get(i));
		}
		for (int i = 0; i <odd.size(); i++) {
			System.out.println(odd.get(i));
		}
		
		
	}

}

