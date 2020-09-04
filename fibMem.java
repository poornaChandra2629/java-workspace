package pass;

public class fibMem {
	static int fib(int n) 
	{ 
	    int []term = new int [1000];  
	    if (n <= 1) 
	        return n; 
	    if (term[n] != 0) 
	        return term[n]; 
	  
	    else 
	    {
	        term[n] = fib(n - 1) + fib(n - 2); 
	        return term[n]; 
	    } 
	} 
	  
	public static void main (String[] args)  
	{ 
	    int n = 30; 
	    System.out.println(fib(n)); 
	} 

}
