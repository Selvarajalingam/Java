import java.util.*;
class matrix
{
	public static void main(String arg[])
	{
		int i,j;
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int a[][]= new int[n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j] =sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[i][j]%5==0)
				{
					System.out.print(" "+a[i][j]);
				}
				else if((i+j)%2==0)
				{
					System.out.print(" "+(a[i][j]+5));
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
					
		