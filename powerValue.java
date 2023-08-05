import java.util.*;
class powerValue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number - ");
        int n= sc.nextInt();
        System.out.println(((n&(n-1))==0)?"yes":"No");
    }
}
