package Collectionslearning;

import java.util.Comparator;

public class Comparatordemo implements Comparator {

	@Override
	public int compare(Object o1,Object  o2) {
		// TODO Auto-generated method stub
		
		Laptop l1 = (Laptop)o1;  //typecasting
		Laptop l2 = (Laptop)o2;
		
		int result = l1.model.compareTo(l2.model);
		if(result>0)
		{
			return +1;
		}
		else if (result<0)
		{
			return -1;
		}
		else 
			return 0;
		
	}
	
}


	
	
	
	
	/*
	
	if(l1.price>l2.price)
		return -1;
	
	else if(l1.price<l2.price)
		return +1;
	
	else {
			
   if (l1.gb>l2.gb)	 
	{
		return -1;
	}
	else if (l2.gb>l1.gb)
		
	{			
		return +1;		
	}

}
	
	return 0; 
	
}  */
