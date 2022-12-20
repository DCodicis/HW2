
public class Program {

	public static void main(String[] args) {
		Sline l=new Sline();
		Sline parallel=new Sline(0.0,4.0,16.0,12.0);
		Sline perpendicular = new Sline(0.0,-14.0,-9.0,4.0);
		System.out.println(parallel.slopLine());
		parallel.slopLine();
		
		double x = l.slopLine()*perpendicular.slopLine();
		
		System.out.println(x);
	}

}
