import java.util.HashMap;
import java.util.Set;

public class AccessOnlyKeyfrommap {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, 'a');
		hm.put('a','b');
		hm.put(2, 'b');
		hm.put(3.3, 'c');
		hm.put('c', hm);
		Set s=hm.keySet();
		System.out.println(s);
//		access key one by one
		for(Object obj:s)
		{
			System.out.println(obj);
		}

	}

}
