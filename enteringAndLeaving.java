import java.util.*;
class enteringAndLeaving
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter the elements for entering persons :");
        int entering[] = new int[n];
        for(i=0;i<n;i++)
        {
            entering[i] = sc.nextInt();
        }
        System.out.println("Enter the elements for leaving persons :");
        int leaving[] = new int[n];
        for(i=0;i<n;i++)
        {
            leaving[i] = sc.nextInt();
        }
        int max=0;
        for(i=0;i<n;i++)
        {
            sum=sum+entering[i]-leaving[i];
            if(max<sum)
            {
                max=sum;
            }
        }
        System.out.println("Maximum number of guests on cruise at an instance is "+max);
    }
}
