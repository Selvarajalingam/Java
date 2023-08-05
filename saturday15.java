import java.util.*;
class water{

 static int Maxwater(int[] arr,int n)
{
	int res=0;
	int i,j;
	for(i=1;i<n-1;i++)
	{
		int right=arr[i];
		for(j=0;j<i;j++)
		{
			right=Math.max(right,arr[j]);
		}
		int left=arr[i];
		for(j=i+1;j<n;j++)
		{
			left=Math.max(left,arr[j]);
		}
		res+=Math.min(right,left)-arr[i];
	}
	return res;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	int i;
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.print(Maxwater(arr,n));
}
}







