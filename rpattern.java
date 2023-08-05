import java.util.*;
class rpattern
{
	public static void main(String arg[])
	{
		int n,i,j;
		System.out.println("enter the size:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-2;j++)
			{
				System.out.print("* ");
			}
			for(j=0;j<n-2;j++)
			{
				if(i==j || j==2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}