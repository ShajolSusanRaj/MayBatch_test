package package1;

public class Student {
	
	int age =10;
	int rollNo=25;
	
	public void display1()
	{
		System.out.println("Welcome all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
public static void main(String[] args)
{
	 	 	Student sd =new Student();
	 	 	sd.display1();
	 	 	sd.display2();
	 	 	System.out.println("Student age is "+sd.age);
	 	 	System.out.println("Student roll No is "+sd.rollNo);

}
}
