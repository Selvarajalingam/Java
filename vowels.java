import java.util.*;
class vowel
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String a=sc.nextLine();
		char[]b=a.toCharArray();
		int size=b.length;
		int i,count=0;
		for(i=0;i<size;i++)
		{
			if(b[i]=='a' || b[i]=='e' || b[i]=='o' || b[i]=='u' || b[i]=='i')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}