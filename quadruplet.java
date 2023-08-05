import java.util.*;
class  quadruplet
{
	public static void main(String args[])
	{
		int n,i,j,k,l,count=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-3;i++)
		{
			for(j=i+1;j<n-2;j++)
			{
				for(k=j+1;k<n-1;k++)
				{
					for(l=k+1;l<n;l++)
					{
						if(a[i]<a[k] && a[k]<a[j] && a[j]<a[l])
						{
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}