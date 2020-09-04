package pass;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class MaximizeIt
{
	public static void prcombinations(List<List<Integer>> arr,int val)
	{
		int n=arr.size();
		int max=0;
		
		int[] a=new int[n];
		for (int i = 0; i < n; i++) 
	        a[i] = 0;
		while (true) { 
			int sum=0; 
	        for (int i = 0; i < n; i++) 
	        {
	        	System.out.print(arr.get(i).get(a[i])+" ");
	            sum= sum + (arr.get(i).get(a[i]) * arr.get(i).get(a[i]));
	        }
	        System.out.print("Sum is" + sum);
	        System.out.println();
	        if((sum%val) > max)
	        	max=sum%val;
	        int next = n - 1; 
	        while (next >= 0 &&(a[next] + 1 >= arr.get(next).size())) 
	            next--; 
	        if (next < 0) {
	        	System.out.println(max);
	            return; 
	        }
	        a[next]++; 
	        for (int i = next + 1; i < n; i++) 
	            a[i] = 0; 
	    }
		
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int val=scanner.nextInt();
		n=n+1;
		List<List<String>> list=new ArrayList<List<String>>();
		while (n>0) {
			List<String> tokens = new ArrayList<>();
			Scanner lineScanner = new Scanner(scanner.nextLine());

			while (lineScanner.hasNext()) {
				tokens.add(lineScanner.next());
			}

			lineScanner.close();
			n--;
			if(!tokens.isEmpty())
			{
				list.add(tokens);
			}
		}
		scanner.close();
		List<List<Integer>> fli=new ArrayList<List<Integer>>();
		for(List<String> i : list)
		{
			List<Integer> flint=new ArrayList<Integer>();
			for(String k : i)
			{
				flint.add(Integer.parseInt(k));
			}
			fli.add(flint);
		}
		prcombinations(fli,val);
		
	}
}