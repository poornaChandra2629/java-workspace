import java.util.Calendar;
import java.util.Scanner;


public class CoutingZeros {
	static String[] factorials=new String[1000*1000*64];
	 static void factorial(int n,int index) 
	    { 
	        int res[] = new int[100000]; 
	        res[0] = 1; 
	        int res_size = 1; 
	        for (int x = 2; x <= n; x++) 
	            res_size = multiply(x, res, res_size); 
	        String number="";
	        for (int i = res_size - 1; i >= 0; i--) 
	            number=number+res[i];
	        factorials[index]=number;
	    } 
	    static int multiply(int x, int res[], int res_size) 
	    { 
	        int carry = 0; 
	        for (int i = 0; i < res_size; i++) 
	        { 
	            int prod = res[i] * x + carry; 
	            res[i] = prod % 10; 
	            carry = prod/10;
	        } 
	        while (carry!=0) 
	        { 
	            res[res_size] = carry % 10; 
	            carry = carry / 10; 
	            res_size++; 
	        } 
	        return res_size; 
	    } 
	    public static long  CheckpsveZero(String s){
	    	long count=0;
	    	for(int i=0;i<s.length();i++) {
	    		if(s.charAt(i)=='0') {
	    			if(i>=2 && s.charAt(i-2)!='-') {
	    				count++;
	    			}
	    			if(i<2) {
	    				count++;
	    			}
	    		}
	    	}
	    	return count;
	    	
	    }
	    public static void main(String args[]) 
	    { 
	    	long startTime = Calendar.getInstance().getTime().getTime();

	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	for(int i=0;i<=n;i++)
	    		factorial(i,i);
	    	for(int i=0;i<=n;i++)
	    		System.out.println(factorials[i] +"non negative zeros are "+ CheckpsveZero(factorials[i]));
	    	long endTime = Calendar.getInstance().getTime().getTime();
			long timeElapsed = endTime - startTime;
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println("Execution time in seconds: " + timeElapsed/1000);
		   
	    } 
	    

}
