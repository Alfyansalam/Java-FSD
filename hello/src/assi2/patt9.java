package assi2;
import java.util.Scanner;
public class patt9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.print("\n");
		}
		for(int i=a-1;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}System.out.print("\n");
		}sc.close();
	}

}
