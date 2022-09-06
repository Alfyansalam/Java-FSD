package assi3;
class Area
{
	public void ar(int a) 
	{
		System.out.println("area of square="+(a*a));
	}
	public void ar(int a,int b)
	{
		System.out.println("area of rectangle="+(a*b));
	}
}

public class oops7 {

	public static void main(String[] args) {
		
Area a=new Area();
a.ar(2,3);
a.ar(2);
	}

}
