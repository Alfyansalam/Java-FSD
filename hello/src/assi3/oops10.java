package assi3;
class Bank
{
	public void getBalance()
	{
		System.out.println(0);
	}
}
class bankA
{
	public void getBalance()
	{
		System.out.println(3000);
	}
}
class bankB
{
	public void getBalance()
	{
		System.out.println(500);
	}
}
class bankC
{
	public void getBalance()
	{
		System.out.println(1000);
	}
}
public class oops10 {

	public static void main(String[] args) {
		bankA a=new bankA();
		bankB b=new bankB();
		bankC c=new bankC();
		a.getBalance();
		b.getBalance();
		c.getBalance();

	}

}
