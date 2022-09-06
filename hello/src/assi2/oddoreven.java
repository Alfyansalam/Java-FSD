package assi2;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		int sume=0,sumo=0,b,r;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		b=a;
		for(int i=0;b!=0;i++)
		{
		r=b%10;
		if(r%2==0)
			sume=sume+r;
		else
			sumo=sumo+r;
		b=b/10;
		}
		System.out.println("sum of even ="+sume);
		System.out.println("sum of odd ="+sumo);

	sc.close();
	}

}
