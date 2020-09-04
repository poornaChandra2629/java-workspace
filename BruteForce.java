package pass;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce {
		
static ArrayList<String> Listpasswords = new ArrayList<String>();	
static void printAllKLengthRec(char[] set,String prefix,int n, int k) {  
	
	if (k == 0)
		{ 
			//System.out.println(prefix); 
		Listpasswords.add(prefix);
		return; 
		} 
	for (int i = 0; i < n; ++i) 
		{ 
			String newPrefix = prefix + set[i];
			printAllKLengthRec(set, newPrefix,n, k - 1);  
		}
	} 
	public static void main(String[] args) {
		String pass="abcdefghijklmnopqrstuvwxyz";
		System.out.println("Enter password to crack");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String Password;
		Password =sc.nextLine();
		int len=pass.length();
		char[] set=pass.toCharArray();
		int index=1;
		System.out.println("We are on way to cracking....!!");
		long start = System.currentTimeMillis();
		while(true)
		{
			int flag=0;
		printAllKLengthRec(set, "", len, index);
		for(String i : Listpasswords)
		{
			System.out.print(i);
			for(int k=0;k<i.length();k++)
			{
				System.out.print("\b");
			}
			if(i.equals(Password))
			{
				flag=1;
				System.out.println("Here your password");
				System.out.println(i);
				break;
			}
		}
		index++;
		Listpasswords.clear();
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F;
		if(flag==1)
		{
			System.out.println("it took time of "+sec+" Seconds");
			break;
		}
		}
	}

}
