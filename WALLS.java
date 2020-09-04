package pass;

import java.util.Scanner;

class WALLS {
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T--!=0) {
			 int N=sc.nextInt();
			 int[] a=new int[N];
			 for(int i=0;i<N;i++) {
				 a[i]=sc.nextInt();
			 }
			 int max1=a[0];
			 int max2=a[N-1];
			 int[] la=new int[N];
			 int[] ra=new int[N];
			 la[0]=max1;
			 ra[N-1]=max2;
			 for(int i=1;i<N;i++)
			 {
				 max1=Math.max(max1, a[i]);
				 max2=Math.max(max2, a[N-i-1]);
				 la[i]=max1;
				 ra[N-i-1]=max2;
			 }
			 int res=0;
			 for(int i=0;i<N;i++)
			 {
				 res += Math.min(la[i], ra[i])-a[i];
			 }
			 System.out.println(res);
			
		 }
	 }
    
}