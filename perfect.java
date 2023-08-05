import java.util.*;
class perfect
{
	perfect()
	{
		int n,i,sum=0;
	    Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}
	public static void main(String arg[])
	{
		perfect obj =new perfect();
	}
}