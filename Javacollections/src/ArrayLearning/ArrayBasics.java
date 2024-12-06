package ArrayLearning;

import java.util.Arrays;

public class ArrayBasics {
	String name;

	public ArrayBasics(String name) {
		// TODO Auto-generated constructor stub		
		this.name = name;
		
		}   

	public static void main(String[] args) {
		

	
	
		
		String [] names = {"vishalkumar","surya", "anil","sureshgarg"};
		ComparatorDemo cd = new ComparatorDemo();
		
		Arrays.sort(names,cd);
		System.out.println("Using comparator Interface - Sorting ");
		
		for(int i= 0; i<names.length; i++)
		System.out.println(names[i]); 
		
		
	
		
	}   
	
}


		
		