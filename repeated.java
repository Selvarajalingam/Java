import java.util.*;
class repeated
{
	public static void main(String arg[])
	{
		int a[]={50,20,10,40,20,10,10,60,30,70};
		int i,j,n=10,count=0,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		System.out.println("total repeated elements:"+(count-1));
		for(i=0;i<n;j++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					temp=a[i];
				}
			}
		}
		System.out.println("repeated elements are:"+a[i]);
	}
}
		
			
			
					