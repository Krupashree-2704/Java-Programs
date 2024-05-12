import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		//add element in vector:
		Vector vector=new Vector();
		vector.add(1);
		vector.add("Shina");
		vector.add(12.34);
		vector.add(1,'a');
		vector.add(true);
		vector.add(null);
		
//		Print added element :access elements
		
//		Using for loop
//		for (int i = 0; i < vector.size(); i++) {
//			System.out.println(vector.get(i));
//		}
		
		
//		Using for each loop
//		for(Object obj:vector)
//		{
//			System.out.println(obj);
//		}
		
//		Using Iterator
//		Iterator itrs=vector.iterator();
//		while (itrs.hasNext()) {
//			System.out.println(itrs.next());
//		}
		
//		Using ListIterator
//		ListIterator listIterate=vector.listIterator();
//		System.out.println("Forward Direction");
//		while (listIterate.hasNext()) {
//			System.out.println(listIterate.next());
//		}
//		System.out.println("Backward Direction");
//		while (listIterate.hasPrevious()) {
//			System.out.println(listIterate.previous());
//		}
		
//		To remove elements
		System.out.println(vector);
		vector.remove(3);
		vector.remove("Shina");
		System.out.println(vector);
		
		
	}

}