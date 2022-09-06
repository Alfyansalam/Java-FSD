package assi7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash8 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		  
	       Scanner sc=new Scanner(System.in);
	       String key =sc.nextLine();
	        map.put(1,"red");
	        map.put(2,"greeen");
	        map.put(3,"blue");
	        
	        for(Map.Entry m : map.entrySet())
	        {    
	        	//System.out.println(m.getKey()+" "+m.getValue()); 
	        	if(map.containsValue(key))
	        	{
	        		 
	        		    System.out.println("found");   
	        		    System.exit(0);
	        	}
	        	//System.out.println(m.getValue());
	        }
	        System.out.println(" not found");
	        

	}

}
