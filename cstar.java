import java.util.*;
class matrix
{
	public static void main(String arg[])
	{
		int i,j,temp;
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
				if(j==1)
				{
					System.out.println("*");
				}
				else if(j==0)
				{
					System.out.println(a[i][j]*a[i][j+2]);
				}
				else
				{
					System.out.println(a[i][j]*a[i][j+1]);
				}
			}
			System.out.println();
		}
	}
}
		