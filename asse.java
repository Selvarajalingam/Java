import java.util.*;
class asse
{
	public static void main(String arg[])
	{
		int n,i,sum=0;
		System.out.println("enter the size:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}