package assi7;

import java.util.Iterator;
import java.util.TreeSet;

public class set5 {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(1);
		t.add(9);
		t.add(2);
		t.add(3);
		t.add(7);
		t.add(4);
		t.add(8);
		
		for(Integer i:t)
		{
			if(i==7)
			{
			break;
			}
			System.out.print(i + " ");
			
		}
	}

}
