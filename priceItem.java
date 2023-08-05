import java.util.*;

public class priceItem {
    
    public static void main(String args[]) {

        Scanner sc  = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<3;i++) {
            String item = sc.next();
            int value = sc.nextInt();
            map.put(item,value);
        }

        String productSold[] = new String[4];
        for(int i=0;i<4;i++) {
            productSold[i] = sc.next();
        }

        int productCost[] = new int[4];
        for(int i=0;i<4;i++) {
            productCost[i] = sc.nextInt();
        }

        int output[] = new int[4];

        for(int i=0;i<productSold.length;i++) {
            String gloces = productSold[i];
            int price = map.get(gloces);
            if(price == productCost[i]) {
                output[i] = 0;
            } else {
                output[i] = 1;
            }
        }

        System.out.println(Arrays.toString(output));
        

    }
}
