import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					al.remove(j);
				}
			}
		}
		System.out.println(al);
//		HashSet h=new HashSet(al);
//		System.out.println(h);

	}

}
