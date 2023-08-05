import java.util.*;
class Double
{
        public static void main(String args[])
        {
			Scanner sc =new Scanner(System.in);
			int n=sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			char c[] = new char[n];
			int i,j,mid=(n/2);
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			a[mid]=a[mid]*b[mid];
			for(i=0;i<n;i++)
			{
				if(i<mid)
				{
					for(j=mid-1;j>=0;j--)
					{
						a[i]=a[i]*b[j];
						i++;
					}
				}
				else if(i>mid)
				{
					for(j=n-1;j>mid;j--)
					{
						a[i]=a[i]*b[j];
						i++;
					}
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			for(i=0;i<n;i++)
			{
				if(a[i]<=9)
				{
					c[i]='S';
				}
				else
				{
					c[i]='D';
				}
			}
			System.out.println();
			for(i=0;i<n;i++)
			{
				System.out.print(c[i]+" ");
			}
		}
}