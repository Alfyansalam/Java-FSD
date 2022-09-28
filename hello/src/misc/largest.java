package misc;

public class largest {

	public static void main(String[] args)
{
		String s="This is aaaaaaaa umberla",la,sm;
		String []sp=s.split(" ");
	la=sp[0];
	sm=sp[2];
		for (int i = 0; i < sp.length; i++) 
		{
			if(sm.length()>sp[i].length())
			{
				sm=sp[i];
				
			}
			if(sp[i].length()>la.length())
			{
				la=sp[i];
			}
			
		}
		System.out.println("Smallest="+sm);
		System.out.println("largest="+la);
	}
}


