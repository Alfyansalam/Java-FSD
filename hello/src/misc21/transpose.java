package misc21;

public class transpose {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{3,4,5},{6,7,8}};
		int [][] b=new int[10][10];
		int i,j,e=0,o=0,temp;
		for(i = 0; i < 3 ; i++)
		{
			
			for(j = 0; j < 3; j++)
			{
				b[j][i]=a[i][j];
				
				
			}
		}
			
		for(i = 0; i < 3 ; i++)
		{
			
		for(j = 0; j < 3; j++)
		{
		
			System.out.print(b[i][j] + " ");
		}System.out.println("\n");
	}
		
		}

	}


