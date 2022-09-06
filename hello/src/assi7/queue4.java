package assi7;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class queue4 {

	public static void main(String[] args) {
		int c=0;
		PriorityQueue<String> t = new PriorityQueue<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("4");
		t.add("5");
		PriorityQueue<String> h = new PriorityQueue<String>();
		h.add("1");
		h.add("2");
		h.add("3");
		h.add("4");
		h.add("5");
		for (String i :t )
		{
			for(String j :h )
			{
				if(i==j)
				{
					//System.out.println(i);
					c++;
				}
			}
		}
		if(t.size()==c)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
