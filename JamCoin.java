package pass;

import java.util.Scanner;

public class JamCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0) != '1' || s.charAt(s.length()-1) != '1')
		{
			System.out.print("Not a JamCoin");
			return;
		}
		for(int i=2;i<11;i++)
		{
			int t=0;
			int sum=0;
			for(int j=s.length()-1;j>=0;j--)
			{
				sum=sum+((s.charAt(j)-48) * (int) Math.pow(i, t));
				t++;
			}
			int isPrime=0;
			for(int k=2; k <= sum/2 ;k++)
			{
				if(sum % k == 0)
				{
					isPrime=1;
					break;
				}
			}
			if(isPrime == 0)
			{
				System.out.print("Not a JamCoin");
				return;
			}
		}
		System.out.print("It is a JamCoin");

	}

}
