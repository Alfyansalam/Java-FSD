package wedhack;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		int a;
		char m,s;
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr age");
		a= sc.nextInt();
		System.out.println("enetr sex");
		m= sc.next().charAt(0);
		System.out.println("enetr martial status");
		s= sc.next().charAt(0);
		
		 if(m=='f')
		{
			System.out.println("Work in urban areas");
		}

	}

}
