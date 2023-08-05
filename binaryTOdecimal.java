import java.util.*;
class binaryTOdecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value:");
        String binary=sc.nextLine();
        int decimal=Integer.parseInt(binary,2);
        System.out.println("Converted to Decimal:"+decimal);  
    }
}