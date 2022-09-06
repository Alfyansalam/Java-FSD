package assi4;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		int [] array=new int[10];
		int a;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(array[i]);
		}
	}

}
