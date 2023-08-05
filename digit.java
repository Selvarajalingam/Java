import java.util.*;
class digit
{
	public static void main(String arg[])
	{
		int n,i,j;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		for(i=0;i<n*2;i++)
		{
			for(j=0;j<n*2;j++)
			{
				if(j==0 || j==n*2)
				{
					System.out.println("##");
				}
				else if(i!=n && j!=n)
				{
					System.out.println(" ");
				}
				if(i==n && j<=n-2)
				{
					System.out.print(" $"); 
				}
				if(i==n && j==n-1)
				{
					System.out.print(" ");
				}
          
			}
			System.out.print("\n");
		}
	}
}
	