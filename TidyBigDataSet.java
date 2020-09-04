package pass;

import java.util.Scanner;

public class TidyBigDataSet {
	public static String Concat(int i,int len)
	{
		String res="";
		for(int j=i;j<len;j++)
			res=res+"9";
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t != 0)
		{
			String s= sc.next();
			int len = s.length();
			for(int i=len-1;i>0;i--)
			{
				if(s.charAt(i-1) > s.charAt(i))
				{
					
					int temp=s.charAt(i-1)-48-1;
					s=s.substring(0,i-1)+Integer.toString(temp)+Concat(i,len);
				}
			}
			if(s.charAt(0) == '0')
				System.out.println("case #"+t+" "+s.substring(1,len));
			else
				System.out.println("case #"+t+" "+s);
			t--;
		}
	}

}
