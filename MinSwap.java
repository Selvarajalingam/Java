import java.util.*;
class MinSwap
{
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n = sc.nextInt();
        System.out.println("Enter the K element:");
        int k = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int left=0,right=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                if(a[i-1]>a[i])
                {
                    left++;
                }
                else{
                    for(i=k+1;i<n;i++)
                    {
                        if(a[i]>a[i+1])
                        {
                            right++;
                        }
                    }
                }
            }
        }
        if(right==left)
        {
            System.out.println("Steps = "+right);
        }
        else{
            int count=right+left;
            System.out.println("Steps = "+count);
        }
    }
}
