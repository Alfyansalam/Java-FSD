package misc;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String s,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		s=sc.nextLine();
		char []ch=s.toCharArray();
		for(int i=0;i<=ch.length/2;i++)
		{
			if(ch[i]!=ch[ch.length-i-1])
			{
				System.out.println("not palindroime");
				System.exit(0);
			}
		}
System.out.println("palindroime");
	}

}
