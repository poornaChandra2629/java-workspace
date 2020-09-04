import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ObstacleGame {

	static int mainFlag=0;
	static int tempflag=0;
	public static int[] getBoundaries(char[][] array,int i,int j)
	{
		List<Character> res=new ArrayList<Character>();
		int a[] = new int[2];
		Arrays.fill(a, -1);
		for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, array.length); x++) {
            for (int y = Math.max(0, j - 1); y <= Math.min(j + 1,array[i].length); y++) {
                if (x >= 0 && y >= 0 && x < array.length && y < array[i].length) {
                    if(x!=i || y!=j){
                    	if(array[x][y] !='R' && array[x][y] != 'A' && array[x][y] !='M' && array[x][y] !='D' && array[x][y] != 'Z')
                    	{
                    		res.add(array[x][y]);
                    	}
                    		if(array[x][y] == 'R')
                    		{
                    			a[0]=x;
                    			a[1]=y;
                    			array[x][y]='Z';
                    		}
                    		if(array[x][y] == 'D')
                    		{
                    			mainFlag=1;
                    			
                    		}
                    	}
                    }
                }
            }
		Collections.sort(res);
		if(tempflag == 1)
			for(char b:res)
				System.out.print(b+" ");
		return a;
        }
	public static void main(String[] args) {
		char[][] array={
			      {'A', 'S', 'L', 'W','M'}, 
			      {'R', 'S', 'L', 'D', 'T'}, 
			      {'M', 'R', 'T', 'R', 'M'},
			      {'T', 'L', 'R', 'M','S'},
			      {'S', 'L', 'S', 'W', 'T'},
			};
		int[] a=new int[2];
		Arrays.fill(a, -1);
		int i=0,j=0;
		while(true) {
			a=getBoundaries(array, i, j);
			tempflag=1;
			if(a[0]!=-1 && a[1]!=-1)
			{
				i=a[0];
				j=a[1];
			}
			System.out.println();
			if(mainFlag ==1)
			{
				System.out.println("DESTINATION");
				break;
			}
		}

	}

}
