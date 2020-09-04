import java.util.Scanner;

public class SquareFreeNumbers {
public static void main(String poorna[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int index=0;
	int[] a=new int[10000 * 10000];
	for(int i=2;i<=n/2;i++)
	{
		if(n % i == 0)
		{
			if(Math.sqrt(i)-Math.floor(Math.sqrt(i)) == 0)
			{
				a[index++]=i;
			}
			else
			{
				int flag=0;
				for(int j=0;j<index;j++)
				{
					if(i % a[j] ==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
					count++;
			}
		}
	}
	System.out.println(count);
	
}
}
