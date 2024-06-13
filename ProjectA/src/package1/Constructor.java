package package1;

public class Constructor {


public Constructor()
{
	this(4,5,6);
	System.out.println("Default paramters");
}
public Constructor(int a)
{
	this();
	System.out.println("Single parameterized");
}
public Constructor(int a, int b)
{
	this(1);
	System.out.println("double parameterized");
}
public Constructor(int a,int b, int c)
{
	
	System.out.println("triple parameterized");
}
public static void main(String []args) {
Constructor cn = new Constructor(2,3);
}
}