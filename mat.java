import java.util.*;
class mat
{
	public static void main(String arg[])
	{
		int n,m,i,j;
		Scanner sc =new Scanner(System.in);
		n =3;
		int a[][]= new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(j=0;j<n;j++)
		{
			if(j%2!=0)
			{
			for(i=2;i>=0;i--)
			{
				System.out.print(" "+a[i][j]);
			}
			}
			else
			{
				for(i=0;i<n;i++)
				{
					System.out.print(" "+a[i][j]);
				}
			}
		}
	}
}
		
		