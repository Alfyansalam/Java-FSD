package assi2;

import java.util.Scanner;

public class patt10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),i=0,k=0,c,y=0;
		c=a/2;
		for(i=0;i<a;i++)
		{k=0;
		c=c-1;
			while(k<=c+3)
			{
				System.out.print(" ");
				k++;
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.print("\n");
		}
		;c=1;
		for( i=a-1;i>0;i--)
		{
			y=1;c++;
			while(y!=c)
			{
				System.out.print(" ");
				y++;
			}
			for(int j=i;j>0;j--)
			{
				
				System.out.print("* ");
			}System.out.print("\n");
			
		}
		sc.close();
	}
	}


