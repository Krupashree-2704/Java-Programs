import java.util.HashMap;

public class HashMapPgm {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "Hello");
		hm.put(2, 'a');
		hm.put(3, 'S');
		hm.put(4, 12);
//		System.out.println(hm);
		
		HashMap h1=new HashMap();
		h1.put(1,23.4);
		h1.put(2, 'v');
		System.out.println(h1);
		
		hm.putAll(h1);
		System.out.println(hm);
		
		h1.remove(1);
		System.out.println(h1);
		
		System.out.println(h1.containsKey(1));
		System.out.println(h1.containsValue(23.4));
		
		System.out.println(h1.containsKey(2));
		System.out.println(h1.containsValue('v'));
		
		System.out.println(hm.entrySet());
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
				
		
		

	}

}
