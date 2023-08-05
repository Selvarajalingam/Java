import java.util.*;
class sum
{
    public static void main(String args[])
    {
        int num,i,j,k;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=num;j++)
            {
					
                if( i==j && j!=(num/2)+1|| i==1 || i==num || j==1 || j==num || j==(num+1)-i && j!=(num/2)+1)
                {
					
                    System.out.print("* ");	
                }
			
                else
                {
                    System.out.print("  ");
                }
            }
			System.out.println(" ");
        }
    }
}