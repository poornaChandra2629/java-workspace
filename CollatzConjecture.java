package pass;

import java.util.Scanner;

public class CollatzConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		long steps=0;
		while(n != 1)
		{
			if(n % 2 == 0)
			{
				n /=2;
			}
			else
			{
				n = 3*n + 1;
			}
			steps++;
		}
		System.out.println(steps);
	}

}
