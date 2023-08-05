import java.util.*;
class neg
{
	public static void main(String arg[])
	{
		int n,i,count=0;
		System.out.println("enter the size:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]= new int[n];
		int b[]=new int[n];
		int j=0
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				b[j]=a[i];
				j++;
				count++;
			}
		}
		System.out.println(count);
	}
}
		