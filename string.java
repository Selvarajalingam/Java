import java.util.*;
class string
{
    public static void main(String args[])
    {
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String s=sc.nextLine();
        System.out.println("Enter the string2:");
        String t=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==t.charAt(i))
            {
                count=0;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
