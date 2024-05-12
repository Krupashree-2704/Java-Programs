import java.util.ArrayList;
import java.util.HashMap;


public class ConvertMapIntoList {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(1, 'a');
		h.put(2, 'd');
		h.put(3, 'f');
		h.put(4, 'g');
		System.out.println(h);
		ArrayList key=new ArrayList(h.keySet());
		ArrayList values=new ArrayList(h.values());
		System.out.println(key);
		System.out.println(values);
		
	}

}
