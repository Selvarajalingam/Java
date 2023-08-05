import java.util.*;
class squareNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int mul=num*num;
        int count=0;
        int temp=num;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        int mod=1;
        for(int i=0;i<count;i++)
        {
            mod=mod*10;
        }
        int result=mul%mod;
        if(result==num)
        {
            System.out.println("Correct Number");
        }
        else
        {
            System.out.println("Wrong Number"); 
        }
    }
}
