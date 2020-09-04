package pass;

import java.util.Scanner;

public class Minions {
	private static int ovewls=0;
	private static int consts=0;
	public static void printString(String s,int l)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				char temp=s.substring(i,j).charAt(0);
				if(temp == 'a' || temp == 'e' || temp == 'i' || temp=='o' || temp =='u')
				{
					ovewls++;
				}
				else
				{
					consts++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		printString(s.toLowerCase(),s.length());
		System.out.println(ovewls>consts?"Kevin "+ovewls:"Stuart "+consts);
	}

}
