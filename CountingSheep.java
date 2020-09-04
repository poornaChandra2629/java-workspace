package pass;

import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t !=0)
		{
			t--;
			long n= sc.nextLong();
			if(n == 0)
			{
				System.out.println("INSOMNIA");
				return;
			}
			int flag=0;
			long temp=0;
			int i=0;
			String s="";
			while(flag != 10)
			{
				flag = 0 ;
				temp = (i + 1)*n;
				i++;
				s=s+Long.toString(temp);
				for(int j=0;j<=9;j++)
				{
					if(s.contains(Integer.toString(j)))
					{
						flag++;
					}
				}
				
				
			}
			System.out.println(temp);

			
		}

	}

}
