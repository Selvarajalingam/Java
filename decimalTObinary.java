import java.util.*;
class decimalTObinary
{
    public static int toBinary(int decimal)
    {
        int i;
        int Binary[] = new int[40];
        int index = 0;
        while (decimal > 0)
        {
            Binary[index] = decimal % 2;
            decimal = decimal / 2;
            index++;
        }
        int binaryValue = 0;
        for (i = index - 1; i >= 0; i--)
        {
            binaryValue = binaryValue * 10 + Binary[i];
        }
        return binaryValue;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal value:");
        int decimal = sc.nextInt();
        int binaryValue = toBinary(decimal);
        System.out.println("Binary value: " + binaryValue);
    }
}
