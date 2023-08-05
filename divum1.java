import java.util.*;
class divum1
{
	public static void main(String args[])
	{
		int i,j,k=0;
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		String str[] = new String[n+1];
		String arr[] = new String[n+1];
		for(i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		for(i=0;i<str.length;i++)
		{
			for(j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					arr[k]=str[j];
					k++;
					break;
				}
			}			
		}
		String temp="";
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
		