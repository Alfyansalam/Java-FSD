package assi7;

import java.util.HashMap;
import java.util.Scanner;

public class hash10 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		  
	       Scanner sc=new Scanner(System.in);
	       int key =sc.nextInt();
	        map.put(1,"red");
	        map.put(2,"greeen");
	        map.put(3,"blue");
	        System.out.println(map.get(key));

	}

}
