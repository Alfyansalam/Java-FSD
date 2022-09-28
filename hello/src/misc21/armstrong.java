package misc21;

public class armstrong {

	public static void main(String[] args) 
	{
		int a=13,n,r=0;
		n=a;
		while (n!=0)
		{
			r+=Math.pow((n%10),3);
			n=n/10;
		}
		System.out.println(r);
if(r==a)
{
	System.out.println("armstrong number");
}
	}

}
