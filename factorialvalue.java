import java.util.Scanner;
class factorialvalue
{
	public static void main(String args[])
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = Scanner.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++)
		{
			factorial*=i;
		}
		System.out.println("factorial of"+ num+"="+factorial);
	}
}