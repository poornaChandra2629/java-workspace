import java.util.Scanner;

public class seconf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(((sum-arr[n-1])*arr[n-1])+(sum-arr[n-2]));

	}

}
