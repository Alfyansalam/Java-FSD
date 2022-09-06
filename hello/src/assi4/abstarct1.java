package assi4;
abstract class Parent
{
	abstract void message();
	
}
class Sub1 extends Parent
{
	public void message()
	{
		System.out.println("this is first subclass");
	}
}
class Sub2 extends Parent
{
	public void message()
	{
		System.out.println("this is second subclass");
	}
}
public class abstarct1 {

	public static void main(String[] args) {
		Sub1 s1=new Sub1();
		Sub2 s2=new Sub2();
		s1.message();
		s2.message();

	}

}
