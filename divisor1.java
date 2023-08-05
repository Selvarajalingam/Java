import java.util.*;
class divisor1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int i=1,c;
		for(i=1;i<=num;i++)
		{
			c=num%i;
		if(c==0)
		{
			System.out.print(""+i);
		}
		}
		
	}
}
		