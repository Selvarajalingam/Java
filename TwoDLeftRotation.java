import java.util.*;
class TwoDLeftRotation
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.print("Before Rotation:\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("After Rotation:\n");
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<n;j++)
			{
				 System.out.print(a[j][i]+" ");
			}
			System.out.println("");
		}
	}
}