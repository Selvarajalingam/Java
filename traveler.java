import java.util.*;
class traveler
{
	public static void main(String args[])
	{
		int i,j,temp;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n>2)
		{
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println(a[0]+" "+a[1]);
		}
		else
		{
			System.out.println("NOT VALID!!");
		}
	}
}
			