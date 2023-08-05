import java.util.*;
class desendingOrder
{
    public static void main(String args[])
    {
        int i,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n= sc.nextInt();
        System.out.println("Enter the array elements:");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}