import java.util.*;
class repelements
{
	public static void main(String args[])
	{
		int i,j,count=0;
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		for(i=0;i<a.length();i+=count)
		{
			count=0;
			for(j=i;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.printf(a.charAt(i)+""+count);
		}
	}
}
		