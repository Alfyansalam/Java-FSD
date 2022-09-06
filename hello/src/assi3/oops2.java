package assi3;

class Member
{
	String name,address;
	int age,phno;
	float salary;
	public void printSalary()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(phno);
		System.out.println(salary);
	}
	
}

class Employee extends Member
{
	char spec,dept;
}

class Manager extends Member
{
	char spec,dept;
}
public class oops2 {

	public static void main(String[] args) {
		Manager m=new Manager();
		Employee e=new Employee();
		
m.name="Abhijith";
m.address="perumbavoor";
m.age=22;
m.phno=911122113;
m.salary=20000;

e.name="Nehla";
e.address="Kodungaloor";
e.age=22;
e.phno=911122113;
e.salary=10000;

m.printSalary();
System.out.println();
e.printSalary();

	}

}
