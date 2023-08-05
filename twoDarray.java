import java.util.*;
class twoDarray
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
        int n= sc.nextInt();
		System.out.println("Enter Flag:");
		int flag=sc.nextInt();
        int a[][]=new int [n][n];
		System.out.println("Before:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
		if(flag==1 && n==3)
		{
			System.out.println("After:");
			for(i=n-1;i>=0;i--)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("After:");
			for(i=n-1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
				{
					System.out.print(a[j][i]+" ");
				}
				System.out.println(" ");
			}
		}
    }
}