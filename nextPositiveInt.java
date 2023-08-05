import java.util.*;
class nextPositiveInt
{
    public static void main(String args[])
    {
        int i,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int sum=a[n-1]+1;
        System.out.println(sum);
    }
}
