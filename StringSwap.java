import java.util.*;
class StringSwap
{
    public static void main(String args[])
    {
        int i,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String word = sc.nextLine();
        char letter[] = word.toCharArray();
        int a[] = new int [word.length()];
        for(i=0;i<word.length();i++)
        {
            a[i]=letter[i];
        }
        for(i=0;i<word.length();i++)
        {
            for(int j=i+1;j<word.length();j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<word.length();i++)
        {
            letter[i]=(char)a[i];
            System.out.print(letter[i]);
        }
    }
}
