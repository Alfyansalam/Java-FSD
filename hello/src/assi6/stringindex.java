package assi6;

public class stringindex {

	public static void main(String[] args) {
		try {
			String a="Abhijith is uyir";
			System.out.println(a.substring(17));
			
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
	}

}
