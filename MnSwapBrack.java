package pass;

import java.util.Scanner;
public class MnSwapBrack 
{ 
	
	static long sc(String s) 
	{ 
		int c1 = 0, c2 = 0; 
		int res = 0 , temp = 0; 
		
		for(int i =0; i< s.length(); i++) 
		{ 
			if(s.charAt(i) == '(') 
			{ 
				c1++; 
				if(temp > 0) 
				{ 
					res += temp; 
					temp--;	 
				} 
			} else if(s.charAt(i) == ')' ) 
			{ 
				c2++; 
				temp = (c2-c1); 
			} 
		} 
		return res; 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s=sc.next();
		System.out.println(sc(s));
		
	} 
}  

