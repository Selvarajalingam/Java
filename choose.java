import java.util.*;
class choose
{
	public static void main(String arg[])
	{
		int option,dash;
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		System.out.print("\n");
		int i;
		String word[]= w.split(" ");
		int l=word.length;
		dash=sc.nextInt();
		String g[] = new String[1];
		g[0]=word[dash];
		word[dash]="______";
		for(i=0;i<l;i++)
				{
				System.out.print(word[i]+" ");
				}
				System.out.print("\n1."+b);
				System.out.println("\n2."+c);
				
				option=sc.nextInt();
		
			if(option==1)
			{
				word[dash]="love";
				for(i=0;i<l;i++)
				{
				System.out.print(word[i]+" ");
				}
			}
			else if(option==2)
			{
				word[dash]="Hate";
				for(i=0;i<l;i++)
				{
				System.out.print(word[i]+" ");
				}
			}
			if(g[0].equals(word[1]))
			{
				System.out.println("100%");
			}
			else
			{
				System.out.println("50%");
			}

	}
}
			
				
		