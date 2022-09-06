package assi3;
class Parent
{
	public void showp()
	{
System.out.println("This is parent class");
	}
}
class Sub extends Parent
{
	public void show()
	{
System.out.println("This is child class");
	}
}

public class oops1 {

	public static void main(String[] args) {
		
Parent p=new Parent();
Sub s =new Sub();
p.showp();
s.show();
s.showp();
	}

}
