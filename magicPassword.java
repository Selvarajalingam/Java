import java.util.*;

public class magicPassword {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String encodedString = sc.nextLine();
        String result = "";

        for(char letter : encodedString.toCharArray()) {
            if(Character.isDigit(letter) || Character.isUpperCase(letter)) {
                result += letter;
            }
        }

        System.out.print(result);
    }
}
