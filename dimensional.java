import java.util.*;
class dimensional
{
	public static void main(String arg[])
	{
		int n,i,j,s=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[][]= new int[n][n];
		int b[][]= new int[n][n];
		int c[][]= new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
				else if(i+j==n-1)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
					
			}
			System.out.println();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}
}