package assi7;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class hash9 {

	public static void main(String[] args) {
HashMap<Integer, String> map = new HashMap<>();
Set<Integer> k=new LinkedHashSet<Integer>();
Set<String> v=new LinkedHashSet<String>();
        map.put(1, "red");
        map.put(2,"greeen");
        map.put(3,"blue");
        for(Map.Entry m : map.entrySet())
        {    
        	k.add((Integer) m.getKey());
        	v.add((String) m.getValue());
        }
System.out.println(k);
System.out.println(v);
	}

}
