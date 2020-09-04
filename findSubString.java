package pass;

import java.util.Scanner;

public class findSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k =sc.nextInt();
		String res=s.substring(0,k);
		int count=0;
		int flag=0;
		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i)=='a' || res.charAt(i) == 'e' || res.charAt(i) == 'i'   || res.charAt(i) == 'o' || res.charAt(i) == 'u' )
			{
				count++;
				if(i == 0)
				{
					flag=1;
				}
			}
		}
		if(count == 0)
		{
			res ="Not found!";
		}
		int max=count;
		try {
			
		for(int i=1;i<s.length()-1;i++)
		{
			if(flag == 1)
			{
				count--;
				flag=0;
			}
			String ss=s.substring(i,i+k);
			if(ss.charAt(0) == 'a' || ss.charAt(0) == 'e' || ss.charAt(0) == 'i' || ss.charAt(0) == 'o' ||ss.charAt(0) == 'u' )
			{
				flag =1;
			}
			if(ss.charAt(ss.length()-1) == 'a' || ss.charAt(ss.length()-1) == 'e' || ss.charAt(ss.length()-1) == 'i' || ss.charAt(ss.length()-1) == 'o' ||ss.charAt(ss.length()-1) == 'u' )
			{
				count++;
			}
			if(count > max)
			{
				max=count;
				res=ss;
			}
			
		}
	}
	catch(StringIndexOutOfBoundsException e)
		{
		
		}
		System.out.print(res);
	}

}
