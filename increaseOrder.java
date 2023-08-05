import java.util.*;
class increaseOrder
{
    public static void main(String args[])
    {
        int i,j,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int a[]=new int[n];
        int res=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=a[i];
            int x=i;
            for(j=i+1;j<n;j++)
            {
                if(a[x]<a[j])
                {
                    sum=sum+a[j];
                    x++;
                }
                else
                {
                    break;
                }
            }
            if(sum>res)
            {
                res=sum;
            }
        }
        System.out.println(res);
    }
}
