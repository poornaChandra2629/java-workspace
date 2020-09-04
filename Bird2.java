package pass;

import java.util.Scanner;

public class Bird2 {
	public static int maxSum(int arr[], int n, int k) 
    { 
        int res = 0; 
        if(k>n)
        {
        	 for(int j = 0; j < n; j++)
		        {
		           res += arr[j];
		        }
        }
        else
        {
        for (int i=0; i<k; i++) 
           res += arr[i]; 
        int s = res; 
        for (int i=1; i<n; i++) 
        { 
        	s = s - arr[i - 1] + arr[(i + k - 1) % n]; 
           res = Math.max(res, s); 
        } 
        }
        return res; 
    } 
    public static void main(String[] args)  
    { 
    	Scanner sc= new Scanner(System.in);
    	int T=sc.nextInt();
    	for(int i=0;i<T;i++)
    	{
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] arr=new int[N];
        for(int j=0;j<N;j++)
        {
        	arr[j]=sc.nextInt();
        }
        
        System.out.println(maxSum(arr,N,M));
    	}
    } 

}
