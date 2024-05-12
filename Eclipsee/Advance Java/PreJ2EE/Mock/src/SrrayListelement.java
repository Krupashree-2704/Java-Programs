package hello;
import java.util.ArrayList;

public class SrrayListelement {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add('a');
		al.add(2);
		al.add(true);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
