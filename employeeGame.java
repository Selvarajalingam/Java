import java.util.*;
class employeeGame
{
    public static void main(String args[])
    {
        int i,j,count=0,count1=0,sum=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n%2!=0)
        {
            count=n;
            System.out.println(count);
        }
        else
        {
            count=n;
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    count1++;
                }
            }
            sum=count+count1;
            System.out.println(sum);
        }
    }
}
