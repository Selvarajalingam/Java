import java.util.*;
class diamond
{
	public static void main(String arg[])
	{
		int n=7,i,j,k,c=n-1;
		for(i=1;i<n*2;i++)
		{
			if(i<=n)
			{
			for(k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			}
			else
			{
				for(k=n;k<=i;k++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=c;j++)
				{
					System.out.print("* ");
				}
				c--;
			}
			System.out.print("\n");
		}
		
	}
}
	
		
			
				
					