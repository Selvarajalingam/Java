import java.util.*;
class divum2
{
	public static void main(String args[])
	{
		int i,j,sum1=0,sum2=0,sum3;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=0;
					arr[j]=0;
				}
			}
			if(arr[i]>0)
			{
				sum1+=arr[i];
			}
			else if(arr[i]<0)
			{
				sum2+=arr[i];
			}
		}
		System.out.println(sum1-sum2);
	}
}