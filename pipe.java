import java.util.*;
class pipe
{
	public static void main(String args[])
	{
		int i,sum1=0,sum2=0,Final;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter a elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a elements:");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int rust=2;
		for(i=0;i<n;i++)
		{
			sum1=sum1+a[i];
		}
		for(i=0;i<n;i++)
		{
			sum2=sum2+b[i];
		}
		if(sum1==sum2)
		{
			System.out.println("BALANCED");
		}
		else
		{
			Final=sum1-sum2;
			Final=Final-rust;
			System.out.println(Final);
		}
	}
}
		