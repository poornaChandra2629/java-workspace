package pass;

import java.util.ArrayList;

public class MeanAndMedian {
	static ArrayList<Integer> finals = new ArrayList<>();
	static double differnec=Double.MIN_VALUE;
	public static void FindandsetMean(double mean, double median,ArrayList<Integer> arr)
	{
		int[] a=new int[arr.size()];
		if((mean-median)<differnec)
		{
			differnec = mean-median;
			finals.clear();
			finals.addAll(arr);
		}
		
		return;
	}
	public static double findMedian(ArrayList<Integer> arr)
	{
		double median=0;
		if(arr.size()%2 ==0)
		{
			int sum=arr.get(arr.size()/2) + arr.get(arr.size()/2-1);
			median = (double) sum/2;
		}
			
		else
			median= (double)arr.get((arr.size())/2);
		return median;
	}
	public static double findMean(ArrayList<Integer> arr)
	{
		double mean=0;
		for(int i:arr)
		{
			mean =mean+i;
		}
		return (double)mean/(double)arr.size();
	}

	    private static void solve(int [] arrInput, int index, int [] temp){
	        if(index==arrInput.length){
	            print(arrInput,temp);
	            return;
	        }
	        temp[index] = 1;
	        solve(arrInput,index+1,temp);
	        temp[index] = 0;
	        solve(arrInput,index+1,temp);
	    }

	    private static void print(int [] arrInput, int [] temp){
	    	ArrayList<Integer> results = new ArrayList<>();
	    	double mean=0;
	    	double median=0;
	        for (int i = 0; i <temp.length ; i++) {
	            if(temp[i]==1)
	                results.add(arrInput[i]);
	        }
	        if(results.size() != 0)
	        {
	        	mean=findMean(results);
	        	median = findMedian(results);
//	        	System.out.println(mean + " " + median);
	        	FindandsetMean(mean,median,results);
	        	
	        }
	        
	    }

	    public static void main(String[] args) {
	        int [] arrInput = {1,2,-3};
	        int [] temp = new int[arrInput.length];
	        int index = 0;
	        solve(arrInput, index, temp);
	        for(int i : finals)
	        {
	        	System.out.print(i+" ");
	        }
	    }
	}

