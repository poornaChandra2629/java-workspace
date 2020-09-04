package pass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exchangedigits {
	static List<Integer> ls=new ArrayList<Integer>();
	 static void printPermutations(String s1, String ans) 
	    { 
	        if (s1.length() == 0) { 
	            ls.add(Integer.parseInt(ans));
	            return; 
	        } 
	  
	        for (int i = 0; i < s1.length(); i++) { 
	            char c = s1.charAt(i); 
	            String s = s1.substring(0, i) + s1.substring(i + 1); 
	            printPermutations(s, ans + c); 
	        } 
	    } 
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		printPermutations(Integer.toString(a),"");
		Collections.sort(ls);
		int result=-1;
		for(int i:ls)
		{
			if(i > b)
			{
				result=i;
				break;
			}
		}
		System.out.println(result);
		
		
	}

}
