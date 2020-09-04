
import java.util.*; 

class RailwaySat { 
	static int findplatformsminium(int at[], int st[], int n) 
	{ 
 
		int avp[]=new int[86400*2];
		int result=1;
		for(int i=0;i<n;i++) {
			++avp[at[i]];
			--avp[st[i]+1];
		}
		for(int i=1;i<86400*2;i++) {
			avp[i]=avp[i]+avp[i-1];
			result=Math.max(result, avp[i]);
		}
		return result;
		
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n*2];
		int[] at=new int[n];
		int[] dt=new int[n];
		int i1=0;
		int i2=0;
		for(int i=0;i<n*2;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n*2;i++) {
			if(i%2==0) {
				at[i1++]=a[i];
			}
			else {
				dt[i2++]=a[i]+a[i-1];
			}
		}
		
		System.out.println(findplatformsminium(at, dt, n)); 
	} 
} 
