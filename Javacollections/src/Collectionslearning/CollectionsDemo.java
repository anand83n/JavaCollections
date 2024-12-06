package Collectionslearning;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import ArrayLearning.ComparatorDemo;

public class CollectionsDemo {

	public static void main(String[] args, PrintStream out) { 
		// TODO Auto-generated method stub
		
	Laptop dell = new Laptop("Inspiron", 50000, 8, true);
	Laptop lenovo = new Laptop("Ideapad", 50000, 6, false);
	Laptop hp = new Laptop("Pavilion", 55000, 10, true);
	
	ArrayList laptopList = new ArrayList();
	laptopList.add(dell);
	laptopList.add(lenovo);
	laptopList.add(hp);
	// Collections.sort(laptopList);
	System.out.println("before sorting" + laptopList);
	
	Comparatordemo cd = new Comparatordemo();
	Collections.sort(laptopList, cd);  
	System.out.println("After sorting:" + laptopList); 
	
	
	
	
		
	//	 ArrayList al = new ArrayList(); 
	//	al.add('y');
	//	al.add('c');
	//	al.add('b');
	//	al.add('t');
	//	System.out.println(al);
	//	Collections.sort(al);
	//	System.out.println(al);
	//	System.out.println(Collections.binarySearch(al, 'u'));   
		
				
				
		

	}

}
