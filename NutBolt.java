import java.util.*;
class NutBolt
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        String a="!#$%&*@^~";
        System.out.println("Enter the elements of nut:");
        String nut=sc.nextLine();
        System.out.println("Enter the elements of bolt:");
        String bolt=sc.nextLine();
        for(i=0;a.charAt(i)!='\0';i++)
        {
            for(j=0;nut.charAt(j)!='\0';j++)
            {
                if(a.charAt(i)==nut.charAt(j))
                {
                    System.out.println(nut.charAt(j));
                    break;
                }
            }
        }
        for(i=0;a.charAt(i)!='\0';i++)
        {
            for(j=0;bolt.charAt(j)!='\0';j++)
            {
                if(a.charAt(i)==bolt.charAt(j))
                {
                    System.out.println(bolt.charAt(j));
                    break;
                }
            }
        }
    }
}
