import java.util.Scanner;
class sortt
{
  public static void main(String[] args)
  {
    int n,i,j,temp;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
        }
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
				}
            }
            
        }
		System.out.print("{");
		for(i=0;i<n;i++);
		{
		System.out.print(a[i]+",");
		}
		System.out.print("}");
    }
} 