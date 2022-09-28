package misc21;

public class sparse {

	public static void main(String[] args) {
		int [][] a= {{0,0,0},{0,0,5},{6,7,8}};
		
		int i,j,e=0,o=0;
		for(i = 0; i < 3 ; i++)
		{
			
			for(j = 0; j < 3; j++)
			{
				if(a[i][j]==0) {
					e++;
				}
				else {
					o++;
				}
			}
		}
		if(e>o)
		System.out.print("sparse matrix");
		else
			System.out.print("non sparse matrix");
		

	}

}
