package assi6;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class i10 {

	public static void main(String[] args) {
		int a,b,c=0,p1 = 0;
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(2);
		l.add(2);
		l.add(1);
		
		System.out.println(l);
		System.out.println("enter element");
		a=sc.nextInt();
		 ListIterator i= l.listIterator();
			while(i.hasNext())
			{
				if(l.get(c)==a)
				{
				 
					System.out.println("first position is "+c);
					break;
				}
				i.next();
					c++;
				
			}
			
			while(i.hasNext())
			{
				if(l.get(c)==a)
				{
				 p1=c;
					
				}
				i.next();
					c++;
				
			}
			System.out.println("last position is "+p1);
	}

}
