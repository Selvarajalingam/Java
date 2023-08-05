import java.util.*;
class painter
{
    public static void main(String args[])
    {
        int i,j,temp,sum=0,sum2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test case:");
        int test=sc.nextInt();
        System.out.println("Enter no of board:");
        int board=sc.nextInt();
        System.out.println("Enter no of painter:");
        int painter=sc.nextInt();
        System.out.println("Enter the array elements:");
        int a[] = new int[board];
        for(i=0;i<board;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<board;i++)
        {
            for(j=i+1;j<board;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<board;i=i+2)
        {
            for(j=i+1;j<board;j++)
            {
                sum=a[i]+a[i+2];
                sum2=a[j]+a[j+2];
            }
        }
        if(sum>sum)
        {
            System.out.println(sum);
        }
        else
        {
            System.out.println(sum2);
        }
    }
}
