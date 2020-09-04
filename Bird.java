package pass;
import java.util.Scanner;

public class Bird {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int testCases, n, m, a[], r, s;
		
		testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++)
		{
		    n = sc.nextInt();
		    m = sc.nextInt();
		    
		    a = new int[n];
		    r = 0;
		    
		    for(int j = 0; j < n; j++)
		    {
		        a[j] = sc.nextInt();
		    }
		    
		    if(m > n)
		    {
		        for(int j = 0; j < n; j++)
		        {
		           r = r + a[j];
		        }
		    }
		    else
		    {
		        for(int j = 0; j < m; j++)
		        {
		           r = r + a[j];
		        }
		    
		        s = r;
		    
		       for(int j = 1; j < n; j++)
		       {
		           s = s - a[j - 1] + a[(j + m - 1) % n];
		           r = Math.max(s , r);
		       }
		    }
		       System.out.println(r);
		}
	}

}
