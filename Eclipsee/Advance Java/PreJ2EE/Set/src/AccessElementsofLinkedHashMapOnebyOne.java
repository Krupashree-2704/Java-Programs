import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class AccessElementsofLinkedHashMapOnebyOne {

	public static void main(String[] args) {
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1, 'a');
		lhm.put(2, 's');
		lhm.put(3, 's');
		lhm.put(4, 'd');
		lhm.put(5, 'f');
		System.out.println(lhm);
		System.out.println(lhm.values());
//		Set s=lhm.entrySet();
//		for (Object object : s) {
//			System.out.println(object);
//		}
		Set s=lhm.entrySet();
		ArrayList al=new ArrayList(s);
		for (Object object : al) {
			System.out.println(object);
		}

	}

}
