package misc21;

public class equla {

	public static void main(String[] args) {
		int [][] a= {{1,2},{3,4}};
		int [][] b= {{1,2},{3,4}};
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				if(a[i][j]!=b[i][j])
				{
				System.out.println("not equal");
				System.exit(0);
				}
			}
		}
		System.out.println("equal");
		
		
		

	}

}