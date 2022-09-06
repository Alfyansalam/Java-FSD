package assi6;

public class noformat1 {

	public static void main(String[] args) {
		try
		{
		int a=Integer.parseInt("ab");
		System.out.println(a);
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
