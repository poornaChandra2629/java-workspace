package pass;

import java.util.Scanner;

public class passwordEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		String res="";
		int number=0;
		int flag=1;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)) && flag==1)
			{
				number=number*10+s.charAt(i)-48;
			}
			else
			{
				flag=0;
			if(s.charAt(i) == '*')
			{
				char temp=res.charAt(res.length()-1);
				char temp2=res.charAt(res.length()-2);
				res=res.substring(0,res.length()-2)+temp+temp2;
			}
			else if(s.charAt(i)=='0')
			{
				res=res+Integer.toString(number%10);
				number=number/10;
			}
			else
			{
				res=res+s.charAt(i);
			}
			}
		}
		if(number !=0)
		{
			res=number+res;
		}
		System.out.print(res);

	}

}
