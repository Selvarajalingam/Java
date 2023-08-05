import java.util.*;

public class pigLatini {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String enStr = sc.nextLine();

        String resultString = "";

        String vowels = "aeiou";

        boolean isVowel = false;
        for(char letter : vowels.toCharArray()) {
            if(letter == enStr.charAt(0)) {
                isVowel=true;
                break;
            }
        }

        String consonantString = "";
        int index = 0;
        if(isVowel) {
            System.out.print(enStr+"-yay");
            System.exit(0);
        } else {
            for(int i=0;i<enStr.length();i++ ) {
                if(enStr.charAt(i) == 'a' || enStr.charAt(i) == 'e' || enStr.charAt(i) == 'i' || enStr.charAt(i) == 'o' || enStr.charAt(i) == 'u' ) {
                    index = i;
                    break;
                }
                consonantString += enStr.charAt(i);
            }
            String substring = enStr.substring(index);
            System.out.print(substring+"-"+consonantString+"ay");
        }
    }
}
