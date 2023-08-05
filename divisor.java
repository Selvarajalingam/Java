import java.util.*;
class divisor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		for(int i=1;i<num+1;i++)
		{
		if(num % i == 0);
		{
			System.out.println(i + " ");
		}

		}
		
	}
}
		