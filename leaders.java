import java.util.*;
class leaders
{
	void printleaders(int arr[],int size)
	{
		for(int i= 0;i<size;i++)
		{
			int j;
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<=arr[j])
				{
					break;
				}
			}
			if(j==size)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		leaders lead = new leaders();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		lead.printleaders(arr,n);
	}
}