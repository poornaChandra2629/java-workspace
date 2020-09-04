package pass;

import java.util.Scanner;

public class Rough {
	public static void main(String poorna[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T--!=0) {
			int N=sc.nextInt();
			int[] p=new int[N];
			int F=sc.nextInt();
			for(int i=0;i<F;i++)
			{
				p[sc.nextInt()-1]++;
			}
			int flag=0;
			int time=0;
			int tempflag=0;
			while(flag !=1) {
				if(tempflag==0) {
				for(int i=0;i<N;i++) {
					if(p[i]==0) {
						tempflag=1;
						break;
					}
				}
				if(tempflag==0)
				{
					time=0;
					break;
				}
				}
				for(int i=0;i<N;i++)
				{
					if(p[i]==1) {
							if(i == 0) {
								p[i+1]=1;
								
							}
							else if(i == N-1) {
								p[i-1]=1;
							}
							else {
								p[i-1]=1;
								p[i+1]=1;
									i++;
							}
						
					}
				}
				flag=1;
				time++;
				for(int i=0;i<N;i++) {
					System.out.print(p[i]+" ");
					if(p[i]==0) {
						flag=0;
						//break;
					}
				}
				System.out.println("time "+time);
			}
			//System.out.println("time"+time);
	
		}
		
		
	}

}