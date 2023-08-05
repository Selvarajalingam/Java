import java.util.*;
class calcTotalTax
{
    /*int calcTotalTax(int n,int a[])
    {
        n=5;
        a[]={1000,2000,3000,4000,5000};
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]*10/100;
            sum=sum+a[i];
        }
        return 0;
    }*/
    public static void main(String args[])
    {
        int bill[]={1000,2000,3000,4000,5000};
        int taxes=0;
        for(int i=0;i<bill.length;i++)
        {
            bill[i]=bill[i]*10/100;
            taxes=taxes+bill[i]; 
        }
        System.out.println(taxes);
    }
}
