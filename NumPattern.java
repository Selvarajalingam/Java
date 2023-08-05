import java.util.*;
class NumPattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print((j-i)+1+" ");
                }
                else
                {
                    System.out.print((i-j)+1+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
