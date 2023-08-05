import java.util.*;
class maxrow
{
	public static void main(String args[])
	{
		int n,m,i,j,t;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[]=new int [n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			b[i]=0;
			for(j=0;j<m;j++)
			{
				b[i]+=a[i][j];
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{		
				if(b[i]<b[j])
				{
					t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
			}
		}
		System.out.println(b[0]);
	}
}
		