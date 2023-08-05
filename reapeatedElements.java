import java.util.*;

class reapeatedElements {
    public static void main(String args[]) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test case:");
        int test = sc.nextInt();
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int i;
        while (test > 0) {
            int a[] = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                count = 0;
                for(int j=i+1;j<n;j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(a[i]);
                    break;
                }
            }
            test--;
        }
    }
}
