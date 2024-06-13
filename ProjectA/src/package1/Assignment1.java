package package1;

public class Assignment1 {
	
	public int sumResult1(int a,int b)
	{
		int sum1= a+b;
		System.out.println("Sum1=" +sum1);
		return sum1;
	}
	public int sumResult2(int sum1,int c)
	{
		int sum2= sum1+c;
		System.out.println("Sum2=" +sum2);
		return sum2;
	}
	public int subResult(int sum2,int d)
	{
		int sub= sum2-d;
		System.out.println("Sub=" +sub);
		return sub;
	}
	public int multiResult(int sub,int e)
	{
		int mul= sub*e;
		System.out.println("Mul=" +mul);
		return mul;
	}
	public void divResult(int mul,int f)
	{
		int div=mul/f;
		System.out.println("Div Final=" +div);	
	}
	public static void main(String[] args)
	{
		 	 	Assignment1 as1 =new Assignment1();
		 	 	int sum1=as1.sumResult1(10,2);
		 	 	int sum2=as1.sumResult2(sum1,2);
		 	 	int sub=as1.subResult(sum2,2);
		 	 	int mul=as1.multiResult(sub,2);
		 	 	as1.divResult(mul,2);

	}
	}


