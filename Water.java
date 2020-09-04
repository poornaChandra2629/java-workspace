
import java.util.ArrayList;
import java.util.Scanner;

public class Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miniWater=0;
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		 ArrayList<String> al = new ArrayList<String>();
		 int range=sc.nextInt();
		 for(int i=0;i<range;i++) {
			 String s=sc.next();
			 int f=sc.nextInt();
			 int l=sc.nextInt();
			 String input=s+" "+Integer.toString(f)+" "+Integer.toString(l);
			 al.add(input);
		 }
		 int li=sc.nextInt();
		 ArrayList<String> links = new ArrayList<String>();
		 ArrayList<String> reslinks = new ArrayList<String>();
		 for(int i=0;i<li;i++) {
			 links.add(sc.next().toLowerCase());
		 }
		 for(String k:links) {
			 if(k.contains("f")) {
				 reslinks.add(k);
			 }
			 else {
				 String temp=k.substring(0,2);
				 int index=0;
				 for(String j:reslinks) {
					 if(j.contains(temp)) {
						 reslinks.remove(index);
						 reslinks.add(j.substring(0,j.length()-2)+k); 
					 }
					 index++;
					
				 }
			 }
		 }
		ArrayList<String> resultList=new ArrayList<String>();
		ArrayList<String> DecrementList=new ArrayList<String>();
		for(String j: reslinks) {
			String values="";
			for(int i=0;i<j.length();i++) {
				if(j.charAt(i) >= 48 && j.charAt(i) <= 57) {
					String t2="C"+j.charAt(i);
					for(String m:al) {
						if(m.contains(t2)){
							String val[]=m.split(" ");
							values=values+" "+val[1];
							break;
						}
					}
				}
					
			}
			DecrementList.add(values.trim());
		}
		
		for(String j: reslinks) {
			String values="";
			for(int i=0;i<j.length();i++) {
				if(j.charAt(i) >= 48 && j.charAt(i) <= 57) {
					String t2="C"+j.charAt(i);
					for(String m:al) {
						if(m.contains(t2)){
							String val[]=m.split(" ");
							values=values+" "+val[2];
							break;
						}
					}
				}
					
			}
			resultList.add(values.trim());
		}
		ArrayList<String> originalList=new ArrayList<String>();
		for(int zx=0;zx<resultList.size();zx++) {
			originalList.add(resultList.get(zx));
		}
		for(String j:resultList) {
			String values[]=j.split(" ");
			for(String s:values) {
				miniWater=miniWater+Integer.parseInt(s);
			}
		}
		//days
		days=days-1;
		while(days !=0) {
		for(int p=0;p<resultList.size();p++) {
			String[] v1=resultList.get(p).split(" ");
			String[] v2=DecrementList.get(p).split(" ");
			String res="";
			for(int j=0;j<v1.length;j++) {
				int val=Integer.parseInt(v1[j])-Integer.parseInt(v2[j]);
				res=res+" "+Integer.toString(val);
				}
			resultList.remove(p);
			resultList.add(p, res.trim());
		}
		for(int h=0;h<resultList.size();h++) {
			int rembe=-1;
			String[] x1=resultList.get(h).split(" ");
			String[] x2=DecrementList.get(h).split(" ");
			String[] x3=originalList.get(h).split(" ");
			for(int l=0;l<x1.length;l++) {
				if(Integer.parseInt(x1[l]) < Integer.parseInt(x2[l])) {
					rembe=l;
				}
			}
			if(rembe!=-1) {
				String lkj="";
				for(int kmn=rembe;kmn>=0;kmn--) {
					miniWater=miniWater+Integer.parseInt(x3[kmn]);
				}
				for(int lkg=0;lkg<=rembe;lkg++)
					lkj=lkj+" "+x3[lkg];
				for(int lkg=rembe+1;lkg<x1.length;lkg++)
					lkj=lkj+" "+x1[lkg];
				resultList.remove(h);
				resultList.add(h, lkj.trim());
			}
			
		}
		days--;
		
		}

		//days
		
		System.out.println("The minium Water required is "+miniWater+" gallons of water");
		 

	}

}
