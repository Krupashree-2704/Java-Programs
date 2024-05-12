import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateObjectFromarray {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("qsp");
		al.add(10.21);
		al.add(20);
		al.add('q');
		al.add('q');
		al.add("Jsp");
		al.add(10);
		
//		Convert arraylist into set
//		LinkedHashSet lhs=new LinkedHashSet(al);
//		System.out.println(lhs);
		
//		Using array indexing
		for (int i = 0; i < al.size(); i++) {
			for (int j = i+1; j < al.size(); j++) {
				if (al.get(i)==al.get(j)) {
					al.remove(i);
					i--;
				}
			}
		}
//		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
//			Iterator itr=al.iterator();
//			while (itr.hasNext()) {
//				System.out.println(itr.next());
//			}
			
		
		
	}
}
	



