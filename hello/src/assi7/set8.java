package assi7;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set8 {

	public static void main(String[] args) {
		Set<String> t=new LinkedHashSet<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("4");
		t.add("5");
		Set<String> h=new LinkedHashSet<String>();
		h.add("1");
		h.add("7");
		h.add("6");
		h.add("4");
		h.add("5");
		for (String i :t )
		{
			for(String j :h )
			{
				if(i==j)
					System.out.println(i);
			}
		}
	}

}
