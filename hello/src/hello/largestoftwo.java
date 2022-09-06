package hello;

import java.util.Scanner;

public class largestoftwo {
	public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	if(a>b)
		System.out.println(a+"is largest");
	else
		System.out.println(b+"is largest");
	sc.close();
}
}