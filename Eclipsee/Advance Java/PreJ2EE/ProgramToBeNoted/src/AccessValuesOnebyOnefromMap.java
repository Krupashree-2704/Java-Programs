import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class AccessValuesOnebyOnefromMap {

	public static void main(String[] args) {
//		Add
		/*
		 * 1.put(key,value)
		 * 2.putAll(map)
		 * 
		 * Remove
		 * 1.remove(key)
		 * 2.clear()
		 * 
		 * Contains/Search
		 * 1.containsKey(key)
		 * 2.containsValue(value)
		 * 
		 * Access
		 * 1.entrySet()
		 * 2.keySet()
		 * 3.values()
		 * 
		 * OtherMethod:
		 * 1.TreeMap()
		 * 2.descendingMap()
		 * 
		 */
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1,"aarya");
		lhm.put(2, "sonu");
		lhm.put(3, "harshada");
		lhm.put(4, "faiza");
		lhm.put(5, "aarya");
		lhm.put(6, "shivani");
		
		ArrayList arrayList=new ArrayList(lhm.values());
		for (Object object : arrayList) {
			System.out.println(object);
		}
//		Set s=lhm.values();
//		ArrayList al=new ArrayList(s);
		
		
//		System.out.println(lhm.values());
//		Set values=(Set)lhm.values();
//		Iterator itr=values.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
	}

}
