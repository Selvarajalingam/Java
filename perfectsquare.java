import java.util.*;
class perfectsquare
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==(j*j))
				{
					count++;
				}
			}
		}
		System.out.println("count:"+count);
	}
}
			