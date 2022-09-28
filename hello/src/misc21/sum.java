package misc21;

public class sum {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{3,4,5},{6,7,8}};
		
		int i,j,e=0,o=0;
		for(i = 0; i < 3 ; i++)
		{
			
			for(j = 0; j < 3; j++)
			{
				e+=a[i][j];
			}
			System.out.println("sum of row"+(i+1)+"="+e);
			e=0;
			
		}
		for(i = 0; i < 3 ; i++)
		{
			
			for(j = 0; j < 3; j++)
			{
				e+=a[j][i];
			}
			System.out.println("sum of column"+(i+1)+"="+e);
			e=0;
			
		}
		

	}

}
