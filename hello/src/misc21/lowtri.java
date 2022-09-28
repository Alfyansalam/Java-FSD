package misc21;

public class lowtri {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{3,4,5},{6,7,8}};
		int [][] b= {{1,2,3},{3,4,5},{6,7,8}};
		int i,j;
		for(i = 0; i < 3 ; i++)
		{
			
			for(j = 0; j < 3; j++)
			{
				if(i >= j) {
					System.out.print(a[i][j]+"\t");
				}
				else {
					System.out.print(0+"\t");	
				}
			}System.out.print("\n");
		}
		
		

	}

}
