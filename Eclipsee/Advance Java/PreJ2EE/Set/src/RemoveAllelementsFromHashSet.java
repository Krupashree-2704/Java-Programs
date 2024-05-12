import java.util.ArrayList;
import java.util.HashSet;

public class RemoveAllelementsFromHashSet {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add('a');
		h.add('b');
		h.add('c');
		h.add('d');
		System.out.println(h);
		ArrayList al=new ArrayList(h);
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++) {
			al.remove(i);
			i--;
		}
		System.out.println(al);

	}

}
