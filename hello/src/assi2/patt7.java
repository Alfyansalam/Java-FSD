package assi2;

import java.util.Scanner;

public class patt7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			int k=a;
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				k--;
			}System.out.print("\n");k--;
		}
		
sc.close();
	}

}
