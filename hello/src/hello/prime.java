package hello;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int a,b,i,f=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a/2;
		i=2;
		System.out.println(b);
		while(i<=b)
		{
			if(a%i ==0)
			{
				f++;
			}	
			i++;
		}
		if(f==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
		sc.close();

	}

}
