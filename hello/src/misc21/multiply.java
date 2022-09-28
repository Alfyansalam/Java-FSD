package misc21;

public class multiply
{
	 public static void main(String[] args) 
	    {
	 int a[][] = { { 2, 4 }, { 3, 4 } };
     int b[][] = { { 1, 2 }, { 1, 3 } };
     int rows1=2,cols2=2,cols1=2,rows2=2;
      
        int r[][] = new int[rows1][cols2];

        for(int i = 0; i < rows1; i++){   
            for(int j = 0; j < cols2; j++){   
                for(int k = 0; k < rows2; k++){   
                   r[i][j] = r[i][j] + a[i][k] * b[k][j];    
                }   
            }   
        }   
        System.out.println("Result Matrix is:");
        for(int i = 0; i < rows1; i++){   
            for(int j = 0; j < cols2; j++){   
               System.out.print(r[i][j] + " ");   
            }   
            System.out.println();
        }
    }

   

      
    }
    
