import java.util.Scanner;

public class MaxP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int l=a.length;
		if(l==1) {
			System.out.println(a[0]);
			return;
		}
		int sum=0;
		int the=a[l-1];
		int sec,fir;
		while(l>2) {
			 sec=a[l-2];
			 fir=a[l-3];
			sum=sum+((sec*the)+fir);
			a[l-2]=the;
			l--;
		}
		sum=sum+(a[l-1]*a[l-2]);
		sum=sum+a[l-1];
		System.out.println(sum);

	}

}
