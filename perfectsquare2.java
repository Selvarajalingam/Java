import java.util.*;
class perfectsquare2
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(a[i]==(j*j))
				{
					count++;
				}
			}
		}
		System.out.println("COUNT:"+count);
	}
}
		