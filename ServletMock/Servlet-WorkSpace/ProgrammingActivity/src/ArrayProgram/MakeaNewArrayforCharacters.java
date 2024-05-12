package ArrayProgram;

import java.util.ArrayList;

public class MakeaNewArrayforCharacters {
	public static void main(String[]args) {
//		Make a ArrayList and Store Values
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add('a');
		arrayList.add(2);
		arrayList.add('b');
		
//		Make another ArrayList to Store Character Value
		ArrayList characterList=new ArrayList();
		System.out.println(arrayList);
		for(Object obj:arrayList)
		{
			if(obj instanceof Character)
			{
				characterList.add(obj);
			}
		}
//		Print the new List
		System.out.println("Character List is : "+characterList);
		
		
	}
}
