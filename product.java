import java.util.*;
class product
{
    public static void main(String args[])
    {
        int i,mul=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            mul=mul*a[i];
        }
        System.out.println(mul);
    }
}
