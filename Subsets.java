package pass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
	public static int max;
	public static int min;
	public static ArrayList<Integer> res=new ArrayList<Integer>();
	public static ArrayList<Integer> res2=new ArrayList<Integer>();
	public static List<String> eqres=new ArrayList<String>();
	public static List<String> eqres2=new ArrayList<String>();
	public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range of array ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements with space separated");
		System.out.println("=============================================");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] res1=new int[(int)Math.pow(2,a.length)];
		printsubsets(a,0,res1,0);
		System.out.println("=============================================");
		System.out.println("The Maximum Sum and its Subset");
		System.out.println("=============================================");
		for(String j:eqres) {
		System.out.print("{");
		int flag=0;
		for(int i=0;i<j.length();i++)
		{
			if(j.charAt(i) == '-')
				flag=1;
			if(j.charAt(i) == ' ' && i!=j.length()-1)
				flag=2;
			if(flag == 0)
			{
				if(j.charAt(i)!=' ')
			System.out.print(j.charAt(i));
			}
			else if(flag == 2) {
				System.out.print(",");
				flag=0;
			}
			else
			{
				System.out.print('-');
				System.out.print(j.charAt(i+1));
				i++;
				flag=0;
			}
		}
		System.out.print("}");
		System.out.print("The max sum is "+ max);
		System.out.println();
		System.out.println();
		}
		System.out.println("=============================================");
		System.out.println("The Minium Sum and its Subset");
		System.out.println("=============================================");
		for(String j:eqres2) {
		System.out.print("{");
		int flag=0;
		for(int i=0;i<j.length();i++)
		{
			if(j.charAt(i) == '-')
				flag=1;
			if(j.charAt(i) == ' ' && i!=j.length()-1)
				flag=2;
			if(flag == 0)
			{
				if(j.charAt(i)!=' ')
			System.out.print(j.charAt(i));
			}
			else if(flag == 2) {
				System.out.print(",");
				flag=0;
			}
			else
			{
				System.out.print('-');
				System.out.print(j.charAt(i+1));
				i++;
				flag=0;
			}
		}
		System.out.print("}");
		System.out.print("The min sum is "+ min);
		System.out.println();
		System.out.println();
		}
		System.out.print("The total possibilities are "+ count);
	}
	public static void printsubsets(int[] a,int i,int[] r,int ci) {
		if(i == a.length) {
			int sum=0;
			count++;
			System.out.print("{");
			for(int k=0;k<ci;k++) {
				sum=sum+r[k];
				System.out.print(r[k]);
				if(k != ci-1)
				{
					System.out.print(",");
				}
			}
			if(sum>=max)
			{
				if(sum != max) {
					eqres.clear();
				}
				
				max=sum;
				res.clear();
				for(int k=0;k<ci;k++) {
					res.add(r[k]);
				}
				String s="";
				for(int z:res)
				{
					s=s+Integer.toString(z)+" ";
				}
				eqres.add(s);
			}
			if(sum<=min) {
				if(sum!= min)
				{
					eqres2.clear();
				}
				min=sum;
				res2.clear();
				for(int k=0;k<ci;k++) {
					res2.add(r[k]);
				}
				String s="";
				for(int z:res2)
				{
					s=s+Integer.toString(z)+" ";
				}
				eqres2.add(s);
			}
			
			System.out.print("} ");
			System.out.print("Sum " + sum);
			System.out.println();
			System.out.println();
			return;
		}
		r[ci]=a[i];
		printsubsets(a, i+1, r, ci+1);
		printsubsets(a, i+1, r, ci);
	}

}
