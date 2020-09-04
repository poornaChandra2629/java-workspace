package pass;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Character> map = new HashMap<>(); 
		map.put(". -", 'A');map.put("- . . .", 'B');map.put("- . - .", 'C');map.put("- . .", 'D');map.put(".", 'E');map.put(". . - .", 'F');
		map.put("- - .", 'G');map.put(". . . .", 'H');map.put(". .", 'I');map.put(". - - -", 'J');map.put("- . -", 'K');map.put(". - . .", 'L');
		map.put("- -", 'M');map.put("- .", 'N');map.put("- - -", 'O');map.put(". - - .", 'P');map.put("- - . -", 'Q');map.put(". - .", 'R');
		map.put(". . .", 'S');map.put("-", 'T');map.put(". . -", 'U');map.put(". . . -", 'V');map.put(". - -", 'W');map.put("- . . -", 'X');
		map.put("- . - -", 'Y');map.put("- - . .", 'Z');
		
		map.put("- - - - -", '0');map.put(". - - - -", '1');map.put(". . - - -", '2');map.put(". . . - -", '3');map.put(". . . . -", '4');
		map.put(". . . . .", '5');map.put("- . . . .", '6');map.put("- - . . .", '7');map.put("- - - . .", '8');map.put("- - - - .", '9');
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		String key="";
		String Word="";
		String Sentence="";
		int checkflag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				flag++;
			}
			else
			{
				if(flag == 1)
				{
					key =key+" "+s.charAt(i);
				}
				else
				{
					key =key+s.charAt(i);
				}
				flag=0;
			}
			if(flag == 3)
			{
				Word=Word+map.get(key);
				key="";
			}
			if(flag == 7)
			{
				Sentence = Sentence+Word+" ";
				Word="";
			}
			
		}
		System.out.println(Sentence+ " "+Word+map.get(key));
		
		
	}

}
