import java.util.*;
public class hashagile
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        char startChar = 'Z';
        for(int i=0;i<num;i++)
		{
            for(int j=0;j<=i;j++)
			{
                if(i==0 && j==0)
				{
                    System.out.print((char)(startChar-temp+1));
                }
                else if(i==j)
				{
                    System.out.print((char)(startChar-temp));
                }
                else
				{
                    System.out.print((char)(startChar-temp+1));
                }
            }
            System.out.println();
            temp--;
        }
    }
}