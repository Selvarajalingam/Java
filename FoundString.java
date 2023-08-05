import java.util.*;
class FoundString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        String a[]=word.split(" ");
        System.out.println("Enter the desired word:");
        String Dword=sc.nextLine();
        for(int i=0;i<a.length;i++)
        {
            if(Dword.equals(a[i]))
            {
                System.out.println("Found!!");
                break;
            }
            else if(i==a.length-1)
            {
                System.out.println("Not Found");
            }
        }
    }
}
