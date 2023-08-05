import java.util.*;
class adj
{
	public static void main(String arg[])
	{
		int i,j;
		float temp;
		Scanner sc =new Scanner(System.in);
		float []a[]= new float[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		float temp1;
		temp1=a[0][0]*a[1][1]-a[0][1]*a[1][0];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				if(i==j)
				{
					if(i+1<2 && j+1<2)
					{
					temp=a[i][j];
					a[i][j]=a[i+1][j+1];
					a[i+1][j+1]=temp;
					}
				}
				else
				{
					a[i][j] = -a[i][j];
				}
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.printf("%.1f",a[i][j]/temp1);
			}
			System.out.println();
		}
	}
}
		
					
						