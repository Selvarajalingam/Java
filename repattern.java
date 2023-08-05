import java.util.*;
class repattern
{
	public static void main(String args[])
	{
		int i,j,n=5,s=0;
		for(i=0;i<n;i++)
		{
			for(s=0;s<n-i-1;s++)
			{
				System.out.printf(" ");
			}
			for(j=0;j<n-s;j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}

