import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapPgm {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1, 1);
//		tm.put(2.5, 2.5);//ClassCastException
		tm.put(2, 'h');
		tm.put(3, "naval");
		tm.put(4, 12.3);
		tm.put(5, true);
		System.out.println(tm);
//		System.out.println(tm.descendingKeySet());
//		System.out.println(tm.descendingMap());
		

		
		

	}

}
