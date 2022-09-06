package assi3;
class Student
{
	String name,address;
	int age;
	Student()
	{
		name="unknown";
		age=0;
		address="not avialable";
	}
	public void setInfo(String a,int b)
	{
		name=a;
		age=b;
	}
	public void setInfo(String a,int b,String c)
	{
		name=a;
		age=b;
		address=c;
		System.out.println(name+" "+age+" "+address);
	}
}
public class oops8 {

	public static void main(String[] args) {
		
Student[] s=new Student[10];
s[0]=new Student();
s[0].setInfo("alfy",2,"maradu");
s[1]=new Student();
s[1].setInfo("abhi",3,"perumb");

	}

}
