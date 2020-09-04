package pass;

import java.util.Scanner;

public class Rangoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int brea=n*4-3;
		String res="";
		for(int i=1;i<n+1;i++)
		{
			for(int j=0;j<i;j++)
			{
				res +=(char)(96+n-j);
				if(res.length()<brea)
					res += '-';
			}
			for(int j=i-1;j>0;j--)
			{
				res +=(char)(97+n-j);
				if(res.length()<brea)
					res += '-';
			}
			int remailen=(brea-res.length());
			if(remailen !=0)
			{
			int secondhalf=(remailen/2);
			int firsthalf=secondhalf+1;
			String fmin="";
			for(int k=0;k<firsthalf;k++)
				fmin +='-';
			res =fmin+res;
			fmin="";
			for(int k=0;k<secondhalf;k++)
				fmin +='-';
			System.out.println(res+fmin);
			}
			else
			{
				System.out.println(res);
			}
			res="";
		}
		for(int i=n-1;i>0;i--)
		{
			res="";
			for(int j=0;j<i;j++)
			{
				res +=(char)(96+n-j);
				if(res.length()<brea)
					res += '-';
			}
			for(int j=i-1;j>0;j--)
			{
				res +=(char)(97+n-j);
				if(res.length()<brea)
					res += '-';
			}
			int remailen=(brea-res.length());
			int secondhalf=(remailen/2);
			int firsthalf=secondhalf+1;
			String fmin="";
			for(int k=0;k<firsthalf;k++)
				fmin +='-';
			res =fmin+res;
			fmin="";
			for(int k=0;k<secondhalf;k++)
				fmin +='-';
			System.out.println(res+fmin);
			
		}
		

	}

}
