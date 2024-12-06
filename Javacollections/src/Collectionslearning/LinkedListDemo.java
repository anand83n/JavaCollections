package Collectionslearning;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
	     LinkedList ll = new LinkedList();     
	     ll.add(5);
	     ll.add(10);
	     ll.add("nithin");
	     ll.add("raja");	     	
	     ll.add(true);
	     
	   
	     System.out.println(ll);
	     ll.addFirst(100);
	     System.out.println(ll);
	     ll.offerFirst(5000);
	     System.out.println(ll);
	     ll.clear();
	     System.out.println(ll);
	     LinkedList ll2 = (LinkedList)ll.clone();
	     System.out.println("Cloned object" + ll2);
	     

	}

}
