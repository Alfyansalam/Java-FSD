package assi2;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		float a,sum=0,avg;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		a=sc.nextInt();
		sum=a+sum;
		}
		 avg=sum/10;
		System.out.println(avg);
		sc.close();
	}

}
