import java.util.*;
class roughh
{
	public static void main(String arg[])
	{
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		n=sc.nextInt();
		for(i=0;i<n+1;i++)
		{
			for(j=0;j<i;j++)
			{
				if(j==i)
				{
					System.out.print("0");
				}
				else if(j%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.print("\n");
		}
		
					
			
	}
}

		