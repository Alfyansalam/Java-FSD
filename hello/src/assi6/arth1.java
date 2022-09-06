package assi6;

public class arth1 {

	public static void main(String[] args) {
		try {
			int [] a= new int[2];
			int d=4/0;
			
			System.out.println("hi");
			}catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}

	}

}
