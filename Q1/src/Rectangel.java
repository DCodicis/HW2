public class Rectangel {
	private int xu,yu,xl,yl;



	public Rectangel(int a,int b,int c,int d){
		xu=a;
		yu=b;
		xl=c;
		yl=d;
	}
	public int getArea() {
		return xl*yu;
	}

	public Rectangel() {
		xu=0;
		yu=0;
		xl=1;
		yl=-1;
	}
	public double getParameter() {
		return ((yu-yl)*2)+((xl-xu)*2);
	}
	public void show() {
		System.out.println("xu="+xu+ "yu="+yu+" xl="+xl+" yl="+yl);
	}
	public void moveTo(int x, int y, int z, int w) {
		xu=x;
		yu=y;
		xl=z;
		yl=w;
	}
	
	public boolean isInside (int x,int y) {
		if(x>xl)
			return true;
		if(x<xu)
			return true;
		if(y>yu)
			return true;
		if(y<yl)
			return true;
		else 
			return false;
	
	}
	public double getDiagonalLength() {

		double width=(xu)-(xl);
		double length=(yu)-(yl);
		double sum=(Math.pow(width, 2))+(Math.pow(length, 2));
		sum = Math.sqrt(sum);
		return sum;
	}
   
	public boolean isSquare() {
		if ((xl)-(xu)==(yu)-(yl))
		return true;
		
		else 
			return false;
	}
	public boolean isGolden() {
		if ((yu)-(yl)==(yu)-(yl)*1.618)
			return true;
		else 
			return false;
	}
	

}