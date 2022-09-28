package misc21;

import java.util.Arrays;

public class addition {

	public static void main(String[] args) {
		int [][] a= {{1,2},{3,4}};
		int [][] b= {{1,2},{3,4}};
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]+=b[i][j];
				System.out.print(a[i][j]+"\t");
			}System.out.println("\n");
		}
		
		
		
		

	}

}
