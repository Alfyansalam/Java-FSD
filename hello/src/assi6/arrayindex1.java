package assi6;

public class arrayindex1 {

	public static void main(String[] args) {
		try {
			int [] a= new int[2];
			
			a[3]=4;
			System.out.println("hi");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}

	}

}
