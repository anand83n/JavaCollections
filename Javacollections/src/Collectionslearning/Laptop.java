package Collectionslearning;

public class Laptop {
	int price;
	int gb;
	boolean touch;
	String model;
	
	public String toString()                    //to string method
	{
		return this.model+ "-" + this.price + " - "+ this.gb + " - "+ this.touch;     //concatenation
	}

	public Laptop(String string, int price, int gb, boolean touch) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.gb = gb;
		this.touch = touch;
		this.model= model;
	}
	
	
	
	

}
