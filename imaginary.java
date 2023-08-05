import java.util.*;
class imaginary
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,sum;
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=a[i]+b[j];
			System.out.println(a[i]+"+"+b[j]+"i");
		}
	}
}
		