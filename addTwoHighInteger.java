import java.util.*;
class addTwoHighInteger
{
    public static void main(String args[])
    {
        int i,j,temp=0;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
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
        int sum=a[n-1]+a[n-2];
        System.out.println(sum);
    }
}
