import java.util.*;
class kpattern
{
	public static void main(String arg[])
	{
		int n=7,i,j,b=0,k,c=1;
		for(i=1;i<n*2;i++)
		{
			if(i<=n-1)
			{
			for(j=1;j<=n-b;j++)
			{
				System.out.print(j);
			}
			b++;
			}
			else
			{
				for(k=1;k<=c;k++)
				{
					System.out.print(k);
				}
				c++;
			}
			System.out.print("\n");
		}
		
	}
}
	
		
			
				
					