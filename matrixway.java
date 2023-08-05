import java.util.*;
class matrixway
{
	public static void main(String arg[])
	{
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size :");
		n=sc.nextInt();
		int arr[][] = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i][j]==0)
				{
					i++;
				}
				else if(arr[i][j]==1)
				{
					i++;
				}
				
			}
		}
		