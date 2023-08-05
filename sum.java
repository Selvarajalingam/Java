import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,count=0,sum=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(sum==target)
				{
					count++;
				}
			}
		}
		if(count>0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}