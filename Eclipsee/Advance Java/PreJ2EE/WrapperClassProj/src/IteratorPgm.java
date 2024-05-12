import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorPgm {

	public static void main(String[] args) {
		ArrayList arrayList =new ArrayList();
		arrayList.add('a');
		arrayList.add(1);
		arrayList.add(10.23);
		arrayList.add("Aarya");
		arrayList.add(3,'e');
		arrayList.add(true);
		
//		For Each Loop
//		for(Object obj:arrayList)
//		{
//			System.out.println(obj);
//		}
		
//		Using Iterator:
//		Iterator itr=arrayList.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		Using ListIterator
		ListIterator listIterator=arrayList.listIterator();
		System.out.println("fetch object in forward direction...");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("fetch obejct in backward direction...");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
