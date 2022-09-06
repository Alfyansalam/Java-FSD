package assi4;
import java.util.*;
public class array5 {

	public static void main(String[] args) {
		int [][]array=new int[2][2];
		Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		array[i][j]= sc.nextInt();
	}
}
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(array[i][j]+" ");
	}
	System.out.println();
}
	}

}
