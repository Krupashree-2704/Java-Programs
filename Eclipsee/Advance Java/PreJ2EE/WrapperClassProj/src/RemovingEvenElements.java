import java.util.ArrayList;
import java.util.Iterator;

public class RemovingEvenElements {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(2);
		al.add(7);
		al.add(8);
		al.add(9);
		for (int i = 0; i <al.size(); i++) {
			int a=(int)al.get(i);
			if (a%2==0) {
				al.remove(i);
				i--;
			}
		}
		System.out.println(al);

	}

}
