import java.util.*;
class repeatedCharacter
{
    public static void main(String args[])
    {
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        System.out.println("Enter the Character:");
        char character=sc.nextLine().charAt(0);
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)==character)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
