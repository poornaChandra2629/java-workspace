import java.util.Arrays;
import java.util.Scanner;

public class CountingPairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		int u=a[0]+k;
		if(a[1]>=u) {
			count++;
		}
		
		Arrays.sort(a);
		for(int i=1;i<n-1;i++) {
			int l=a[i]-k;
			int u1=a[i]+k;
			if(a[i-1]>=l || a[i+1]<=u1) {
				count++;
			}
		}
		int l=a[n-1]-k;
		if(a[n-2]<=l) {
			count++;
		}
		System.out.print(count);
	}

}
