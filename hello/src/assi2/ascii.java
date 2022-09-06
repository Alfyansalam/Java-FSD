package assi2;

import java.util.*;
public class ascii {

	public static void main(String[] args) {
		
		 char val;
	     int ascii;
	     Scanner sc=new Scanner(System.in);

	    
	     val=sc.next().charAt(0); 

	     ascii=(int)val;

	     System.out.println(ascii);
	     sc.close();
	}

}
