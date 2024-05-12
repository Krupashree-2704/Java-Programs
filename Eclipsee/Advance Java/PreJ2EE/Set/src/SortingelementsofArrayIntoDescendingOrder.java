import java.util.ArrayList;
import java.util.TreeSet;

public class SortingelementsofArrayIntoDescendingOrder {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(2);
		al.add(4);
		TreeSet t=new TreeSet(al);
		System.out.println(t.descendingSet());

	}

}
