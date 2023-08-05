import java.util.*;
class chalan
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		int count;
		while(amount>0)
		{
			count=amount/2000;
			amount=amount%2000;
			System.out.println("count of 2000:"+count);
			count=amount/1000;
			amount=amount%1000;
			System.out.println("count of 1000:"+count);
			count=amount/500;
			amount=amount%500;
			System.out.println("count of 500:"+count);
			count=amount/100;
			amount=amount%100;
			System.out.println("count of 100:"+count);
			count=amount/50;
			amount=amount%50;
			System.out.println("count of 50:"+count);
			count=amount/10;
			amount=amount%10;
			System.out.println("count of 10:"+count);
			count=amount/1;
			amount=amount%1;
			System.out.println("count of 1:"+count);
		}
	}
}