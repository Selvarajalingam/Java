import java.util.*;
public class findNumber {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int findValue = sc.nextInt();
        int size = sc.nextInt();
        int nums[] = new int[size];

        for(int i=0;i<size;i++) {
            nums[i] = sc.nextInt();
        }


        for(int i=0;i<size;i++) {
            if(findValue == nums[i]) {
                System.out.print("Yes");
                System.exit(0);
            }
        }

        System.out.print("No");
    }
}
