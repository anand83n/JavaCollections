package Collectionslearning;

import java.util.ArrayList;
import java.util.Iterator;

public class cursorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] s = {"ram", "surya", "mark"};
		
		ArrayList names = new ArrayList();
		names.add("ram");
		names.add("surya");
		names.add("mark");
		names.add("suresh");
		names.add(5);
		//System.out.println(names);
		
		Iterator i = names.iterator();
		while(i.hasNext())
		{
			if(i.next().equals("suresh"))
				i.remove();
		}
	System.out.println(names);

	}

}

