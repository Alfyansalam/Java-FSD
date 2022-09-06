package assi5;

public class exe1 {

	public static void main(String[] args) {
		try {
		int [] a= new int[2];
		int d=4/0;
		//a[3]=4;
		System.out.println("hi");
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}System.out.println("hi");
	}

}
