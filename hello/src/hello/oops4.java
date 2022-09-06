package hello;


class Shape
{
	public void show()
	{
		System.out.println("This is shape");
	}
	
}
class rectangle extends Shape
{
	public void showr()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape
{
	public void showc()
	{
		System.out.println("This is circular shape");
	}
}
class square extends rectangle
{
	public void shows()
	{
		System.out.println("square is rectangle");
	}
}
public class oops4 {

	public static void main(String[] args) {
	square obj=new square();
	obj.show();
	obj.showr();

	}

}
