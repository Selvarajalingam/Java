import java.util.*;
class repeatAndSmallPositive
{
    public static void main(String args[])
    {
        int i,j,result=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            result=-1;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    result = a[i];
                }
            }
            if(result != -1) {
                System.out.println(result);
            }
        }

        for(int num : a) {
            if(num>=0) {
                if(num-1 >0){
                    System.out.print(num-1);
                    break;
                }
                else{
                    System.out.print(num);
                    break;
                }
            }
        }
    }
}