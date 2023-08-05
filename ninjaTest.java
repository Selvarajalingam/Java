import java.util.*;
class ninjaTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test case:");
        int test=sc.nextInt();
        System.out.println("Enter the days and Chapter:");
        int days=sc.nextInt();
        int chapter=sc.nextInt();
        int i,j=0;
        int max[]=new int[j];
        int sum;
        int a[] = new int[chapter];
        for(i=0;i<chapter;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<chapter;)
        {
            sum=0;
            sum=a[i]+a[i+1];
            if(sum<chapter)
            {
                max[j]=sum;
                j++;
            }
            else
            {
                max[j]=a[i];
            }
            i=i+2;
        }
        for(i=0;i<chapter;i++)
        {
            System.out.println(max[j]);
        }
    }
}
