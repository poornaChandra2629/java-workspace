package pass;

import java.util.Scanner;

public class TidyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		while(n != 0)
		{
			long t = n;
			int flag = 0;
			while(t != 0)
			{
				long m = t % 10;
				t /= 10;
				if(m < (t % 10))
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(n);
				break;
			}
			
			n--;
		}

	}

}
