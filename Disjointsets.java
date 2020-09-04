package pass;
/* 
Find the number of ways to divide an array a of n integers into any number of disjoint non-empty segments so that, in each segment, there exist at most k distinct integers that appear exactly once.

Since the answer can be large, find it modulo 998244353.
Input
The first line contains two space-separated integers n and k (1<=k<=n<=10^5)  the number of elements in the array a and the restriction from the statement.

The following line contains n space-separated integers a1,a2,…,an (1<=ai<=n) — elements of the array a.

Output
The first and only line contains the number of ways to divide an array a modulo 998244353.
sample Input:
3 1
1 1 2
sample output:
3

sample Input:
5 2
1 1 2 1 3

sample output:
14

sample Input:
5 5
1 2 3 4 5

sample output:
16
  */
import java.util.Arrays;
import java.util.Scanner;

public class Disjointsets {
	static int possibilities=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=============================================");
		System.out.println("Enter the range of array and K  ");
		System.out.println("=============================================");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		System.out.println("=============================================");
		System.out.println("Enter the array elements with space separated");
		System.out.println("=============================================");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] res1=new int[(int)Math.pow(2,a.length)];
		res1[0]=a[0];
		System.out.println("=============================================");
		System.out.println("The all possibilities are given below");
		System.out.println("=============================================");
		printsubsets(a,1,res1,1,k);
		System.out.println("=============================================");
		System.out.println("All The number of that staifies the given condition possibilities are  "+ possibilities%998244353);
		System.out.println("=============================================");

	}
	public static void printsubsets(int[] a,int i,int[] r,int ci,int k) {
		if(i==a.length) {
			printDisjoint(r,ci,k);
			return;
		}
		r[ci]=a[i];
		printsubsets(a, i+1, r, ci+1,k);
		r[ci]=-1;
		r[ci+1]=a[i];
		
		printsubsets(a, i+1, r, ci+2,k);
	}
	public static void printDisjoint(int[] r,int ci,int k) {
		int[] f=new int[100001];
		Arrays.fill(f, 0);
		int count=0;
		int count2=0;
		int flag=0;
		for(int i=0;i<ci;i++) {
			if(r[i] != -1) {
				if(f[r[i]]+1 == 1)
				{
					count++;
				}
				else
				{
					count2++;
				}
				f[r[i]]++;
				if(count>k && count2!=0)
				{
					flag=1;
					break;
				}
			}
			else
			{
				Arrays.fill(f, 0);
				count=0;
				count2=0;
			}
			
		}
		if(flag==0) {
			possibilities++;
			System.out.print("[[");
			for(int i=0;i<ci;i++) {
				if(r[i]!=-1) {
					System.out.print(r[i]);
					if(i != ci-1 && i<ci && r[i+1]!=-1)
					System.out.print(",");
				}
				
				else
					System.out.print("],[");
			}
			System.out.print("]]");
			System.out.println();
		}
	}
}
