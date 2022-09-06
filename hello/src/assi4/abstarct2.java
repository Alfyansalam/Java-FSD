package assi4;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals
{
	public void cats()
	{
		System.out.println("cats meow");
	}
	public void dogs()
	{
		
	}
}
class Dogs extends Animals
{
	public void dogs()
	{
		System.out.println("dogs bark");
	}
	public void cats()
	{
		
	}
}
public class abstarct2 {

	public static void main(String[] args) {
	Cats c=new Cats();
	Dogs d=new Dogs();
	c.cats();
	d.dogs();
	}

}
