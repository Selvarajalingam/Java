import java.util.*;
class reverse
{
	public static void main(String arg[])
	{
		int n,i,j,temp=0;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			System.out.print(" "+a[i]);
		}
		
	}
}
			
		