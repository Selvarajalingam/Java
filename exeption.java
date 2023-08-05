import java.lang.Throwable;
import java.util.*;
class sample
{
	public static void main(String args[])
	{
		sample obj = new sample();
		obj.divide();
		obj.add();
	}
	void add()
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=n1+n2;
		System.out.println("ADDITION "+result);
	}
	void divide()
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try
		{
			int result=n1/n2;
			System.out.println("DIVISION "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("please check the no2");
			divide();
		}
	}
}