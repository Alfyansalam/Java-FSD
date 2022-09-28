package misc;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		int a;
		char m,s;
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr age");
		a= sc.nextInt();
		System.out.println("enetr sex");
		m= sc.next().charAt(0);
		System.out.println("enetr status");
		s= sc.next().charAt(0);
		if(m=='m'&& a>20 && a<40)
		{
			System.out.println("Work anywhere");
		}else if(m=='m'&& a>40 && a<60)
		{
			System.out.println("Work in urban areas");
		}else if(m=='f')
		{
			System.out.println("Work in urban areas");
		}else
		{
			System.out.println("Error");
		}

	}

}
