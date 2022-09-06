package assi3;
class A
{
	public static void print()
	{
		System.out.println("Parent");
	}
}
class B extends A
{
	public static void print()
	{
		System.out.println("Child");
	}
}

public class oops12 {

	public static void main(String[] args) {
		
A a=new A();
B b=new B();
a.print();
b.print();
A obj=new B();
obj.print();
	}

}
