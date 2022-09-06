package assi6;

import java.util.Iterator;
import java.util.LinkedList;

public class i5 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		Iterator<Integer> i= l.iterator();
		//while(i.hasNext())
		//{
			//System.out.println(i.next());
		//}
		l.add(0,2);
		
		//while(i.hasNext())
			System.out.println(l);
	}

}