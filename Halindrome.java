import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Halindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		double i1=1;
		double i2=2;
		double r=i2/i1;
		double a=1/r;
		int n=5;
		DecimalFormat df=new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(df.format((a*(1-Math.pow(r, n)))/(1-r)));

	}

}
