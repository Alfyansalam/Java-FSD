package hello;
class Degree
{
	public void getDegree()
	{
		System.out.println("i got a degree");
	}
}
class underGraduate
{
	public void show()
	{
		System.out.println("I am undergraduate");
	}
}
class postgraduate
{
	public void show()
	{
		System.out.println("I am postgraduate");
	}
}

public class oops9 {

	public static void main(String[] args) {
		underGraduate u=new underGraduate();
		postgraduate p=new postgraduate();
		Degree d=new Degree();
		d.getDegree();
		u.show();
		p.show();
	}

}
