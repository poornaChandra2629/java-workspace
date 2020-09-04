package pass;

import java.util.Scanner;

public class wall2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T--!=0) {
			 int N=sc.nextInt();
			 int[] a=new int[N];
			 for(int i=0;i<N;i++) {
				 a[i]=sc.nextInt();
			 }
			 int flag= a[0]<=a[N-1]?1:2;
			 int water=0;
			 if(flag == 1)
			 {
				 int min=a[0];
				 for(int i=1;i<N;i++)
				 {
					 if(min<=a[i])
						 min=a[i];
					 else
						water += min-a[i];
				 }
			 }
			 else {
				 int min=a[N-1];
				 for(int i=N-2;i>=0;i--)
				 {
					 if(min<=a[i])
						 min=a[i];
					 else
						 water += min-a[i];
						 
				 }
				 
			 }
			 System.out.println(water);
		 }

	}

}
