package assi7;

import java.util.PriorityQueue;

public class queue5 {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("red");
		p.add("green");
		p.add("blue");
		p.add("black");
		System.out.println(p);
		System.out.println(p.peek());
	}

}
