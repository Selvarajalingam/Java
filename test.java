import java.util.*;
class test
{
	public static void main(String args[])
	{
		int i,j;
		System.out.print("ENTER THE SIZE OF 1ST ARRAY:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		int c[]= new int[n];
		System.out.println("Elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("ENTER THE SIZE OF 2ND ARRAY:");
		System.out.println("Elements:");
		for(j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		int temp;
		for(i=0;i<n;i++)
		{
			temp=b[j]%a[i];
			if(temp==0)
			{
				System.out.println("N");
			}
			else if(temp==1)
			{
				System.out.println("O");
			}
			else if(temp==2)
			{
				System.out.println("E");
			}
		}
	}
}
		