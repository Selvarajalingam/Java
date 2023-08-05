import java.util.*;
class fingerCount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n-5;
		int index=m/4;
		int rem=m%4;
		String a[]={"Thumb","Index","Middle","Ring","Little"};
		if(index%2!=0)
		{
			System.out.println(a[rem]);
		}
		else
		{
			System.out.println(a[a.length-rem-1]);
		}
	}
}