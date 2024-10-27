package ArrayLearning;

import java.util.Arrays;
import java.util.Comparator;


public class Arraylearningdemo {

	public static void main(String[] args) {
		
		int [] arr = {5,3,10,18,92};
		for(int i : arr)
		//	System.out.println(i);
		
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting");
		
		for(int i: arr)
			System.out.println(i);    // primitive data type 
		
		
		String[] names = {"Arul", "vijayy", "anil", "kavin"};
		
		System.out.println("Before sorting names");
		for(String s: names) 
			System.out.println(s);
		
	Arrays.sort(names);
	
	System.out.println("After sorting names");
	for(String s : names)
		
		System.out.println(s);       // non primitive data type 
	
		
	
	//Dynamic Binding 
	Comparator comp = new ComparatorDemo();
	Arrays.sort(names,comp);
	
	System.out.println("*******After compare method usage*******");
	for(String s : names)
		System.out.println(s);
	
	}

}
