package pass;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		String s=sc.next();
		s +=sc.nextLine();
		s=s.replaceAll(" ", "");
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		int n1=sc.nextInt();
		int[] pos=new int[n1];
		int maxmi=1;
		String res=s+"$"+sb+"$";
		for(int i=0;i<n1;i++)
		{
			pos[i]=sc.nextInt();
			if(pos[i]>maxmi)
			{
				maxmi=pos[i];
			}
			
		}
		while(res.length()<=maxmi)
		{
			res=res+res;
		}
		for(int i=0;i<n1;i++)
		{
			System.out.println(res.charAt(pos[i]-1));
		}
		System.out.println(res);
		
		
//		int flag=0;
//		int i=0;
//		while(i<=n1)
//		{
//			if(flag==0)
//			{
//				res=res+s+"$";
//				flag=1;
//			}
//			else
//			{
//				res=res+sb+"$";
//				flag=0;
//			}
//			try {
//			if(pos[i]<=res.length())
//			{
//				System.out.println(res.charAt(pos[i]-1));
//				i++;
//			}
//			}
//			catch( Exception ArrayIndexOutOfBoundsException)
//			{
//				
//			}
//		}
		
		
		
	}

}
