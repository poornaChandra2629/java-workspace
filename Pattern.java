package pass;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		String s1="";
		for(int i=0;i<n;i++)
		{
			s1=s1+s[i];
		}
		int n1=sc.nextInt();
		int[] pos=new int[n1];
		for(int i=0;i<n1;i++)
		{
			pos[i]=sc.nextInt();
		}
		int maximum = pos[0];   
	    for (int i=1; i<n1; i++) {
	        if (pos[i] > maximum) {
	            maximum = pos[i];   
	        }

	}
	    String res="";
	    StringBuilder rev = new StringBuilder(); 
        rev.append(s1); 
        rev = rev.reverse();
        int len=res.length();
        int flag=0;
        while(len<=maximum)
        {
        	if(flag==0)
        	{
        		res=res+s1;
        		flag=1;
        	}
        	else
        	{
        		res=res+rev;
        		flag=0;
        	}
        	res=res+"$";
        	len=res.length();
        }
        for(int i=0;i<n1;i++)
        {
        		System.out.println(res.charAt(pos[i]-1));
        		
        }
        
	}

}
