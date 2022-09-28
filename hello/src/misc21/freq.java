package misc21;

public class freq {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{3,4,5},{6,7,8}};
		
		int i,j,e=0,o=0;
		for(i = 0; i < 3 ; i++)
		{
			
			for(j = 0; j < 3; j++)
			{
				if(a[i][j]%2==0) {
					e++;
				}
				else {
					o++;
				}
			}
		}
		System.out.print("even="+e+"odd="+o);
		

	}

}
