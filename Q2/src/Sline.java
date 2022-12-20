
public class Sline {
	private double x1,x2,y1,y2;


	public  Sline() {
		x1=0.0;
		y1=1.0;
		x2=4.0;
		y2=3.0;
		}
	public Sline(double a, double b, double c,double d) {
		x1=a;
		y1=b;
		x2=c;
		y2=d;
	}
	public Sline(double a,double b) {
		x2=a;
		y2=b;
	}
	public double slopLine() {
		double sum = (y2-y1)/(x2-x1);
		return sum;
				  
	}
	public  boolean isOn (double c, double d) {
		double m=slopLine();
		double b=y1;
		System.out.println(d==m*c+b);
		return true;

		  
			
	}
		    
	public void show() {
		System.out.println('('+x1+','+y1+')'+'('+x2+','+y2+')');
					
			
	}

}
