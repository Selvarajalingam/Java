import java.util.*;
class exam
{
	public static void main(String arg[])
	{
		int i,n,l,w,h;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		l=sc.nextInt();
		for(i=0;i<n;i++)
		{
			w=sc.nextInt();
			h=sc.nextInt();
			if(w<l || h<l)
			{
				System.out.println("upload another");
			}
			else if(w==h)
			{
				System.out.println("accepted");
			}
			else
			{
				System.out.println("crop it");
			}
		}
	}
}
