import java.math.BigInteger;

public class LargeFact {
	 public static void main(String[] args)
	    {
	        int n = 10000; 
	        BigInteger result =factorial(n);
	        System.out.print(result.toString().length());
	    }
	 
	    public static BigInteger factorial(int n)
	    {
	       BigInteger result = BigInteger.ONE;
	       BigInteger fact = BigInteger.valueOf(n);
	       	if(n==1 || n ==0) {
	       		return result;
	       	}
	           
	       return fact.multiply(factorial(n-1));
	    }
}
