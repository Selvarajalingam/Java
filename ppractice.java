import java.util.*;
class ppractice
{
	public static void main(String arg[])
	{
		int n=5,i,j;
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			