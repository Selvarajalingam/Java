import java.util.*;
class pyramid
{
	public static void main(String arg[])
	{
		int n=5,i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
		    {
			    System.out.print(k+" ");
		    }
			for(k=i-1;k>0;k--)
			{
				System.out.print(k+" ");
			}
			System.out.print("\n");
		
		}
		
		
	}
}
			