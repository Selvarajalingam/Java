import java.util.*;
class factorialAndTrail
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int fact=1,i,count=0;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
        String trail =Integer.toString(fact);
        for(i=0;i<trail.length();i++)
        {
            if(trail.charAt(i)=='0')
            {
                count++;
            }
        }
        System.out.println("The Trailing value of "+n+" is "+count);
    }
}