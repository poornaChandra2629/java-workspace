
class MiniumSwaps { 
	
	static int findMinSwaps(int arr[], int n) 
	{ 
		int noOfZeroes[] = new int[n]; 
		int i, count = 0; 
		noOfZeroes[n - 1] = 1 - arr[n - 1]; 
		for (i = n - 2; i >= 0; i--) 
		{ 
			noOfZeroes[i] = noOfZeroes[i + 1]; 
			if (arr[i] == 0) 
				noOfZeroes[i]++; 
		} 
		for (i = 0; i < n; i++) 
		{ 
			if (arr[i] == 1) 
				count += noOfZeroes[i]; 
		} 
		return count; 
	} 
 
	public static void main(String args[]) 
	{ 
		int ar[] = { 1,1,0,0 }; 
		System.out.println(findMinSwaps(ar, ar.length)); 
	} 
} 
