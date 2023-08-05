import java.util.*;
class left
{
	public static void main(String arg[])
	{
		int n,i,temp=0,temp2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements:");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("before left swift:");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		temp=a[0];
		temp=a[1];
		for(i=0;i<n-1;i++)
		{
			a[i]=a[i+2];
		}
		a[n-2]=temp;
		a[n-1]=temp2;
	}
}
		
		