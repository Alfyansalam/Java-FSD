package assi7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash7 {

	public static void main(String[] args) {
HashMap<Integer, String> map = new HashMap<>();
		  
     //  Object key=4;
       Scanner sc=new Scanner(System.in);
       Object key =sc.nextInt();
        map.put(1, "red");
        map.put(2,"greeen");
        map.put(3,"blue");
     //   System.out.println(map);
        for(Map.Entry m : map.entrySet())
        {    
        	//System.out.println(m.getKey()+" "+m.getValue()); 
        	if(m.getKey()==key)
        	{
        		    System.out.println("found");   
        		    System.exit(0);
        	}
        }
        System.out.println(" not found");
        

	}

}
