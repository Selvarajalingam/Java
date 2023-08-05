import java.util.*;
class StockSpan
{
    public static void main(String args[])
    {
        int i,j,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n= sc.nextInt();
        System.out.println("Enter the elements:");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
          System.out.print("1 ");
        for(i=1;i<n;i++)
        {
            count=0;
            for(j=i-1;j>=0;j--)
            {
                if(a[j]>=a[i])
                {
                    count++;
                    break;
                }
                else
                {
                    count++;
                }
            }
            System.out.print(count+" ");
            sc.close();
        }
    }
}
