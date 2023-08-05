import java.util.*;
class test11
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] arr=a.split(" ");
		int i;
		int l=arr.length;
		for(i=l-1;i>=0;i--)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
		
		
		