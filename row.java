import java.util.*;
class row
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int v=0,f=0;
		for(i=0;i<n;i++)
		{
			int count=0;
			for(j=0;j<n;j++)
			{
				if(a[i][j]==1)
				{
					count++;
				}
			}
			if(v<count)
			{
				v=count;
				f=i+1;
			}
		}
		System.out.print(f);
	}
}
			