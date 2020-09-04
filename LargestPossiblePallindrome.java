package pass;

import java.math.BigInteger;
import java.util.Scanner;

public class LargestPossiblePallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int flag=0;
		BigInteger bi=new BigInteger(s);
		while(true)
		{
			String  rev=new StringBuilder(s).reverse().toString();
			if(s.compareTo(rev) == 0)
			{
				System.out.println("Yes Pallindrome "+ s);
				flag=1;
				break;
			}
			bi=bi.subtract(BigInteger.ONE);
			s=bi.toString();
		}
		if(flag==0)
		System.out.println("Sorry Not Possible");
	}

}
