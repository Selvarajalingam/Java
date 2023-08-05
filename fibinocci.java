import java.util.*;
class fibinocci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1;
		int f3=0;
		int f1=1,f2=1;
		while(i<num-1)
		{
			
			
			f3=f1+f2;
			f1=f2;
			f2=f3;
			i++;
			
		}
		System.out.println(f3);
		
	}
}
		