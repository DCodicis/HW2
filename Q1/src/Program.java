
public class Program {

	public static void main(String[] args) {


		Rectangel r1= new Rectangel(3,4,5,2);
		Rectangel r2=new Rectangel (5,6,7,1);
		r2.moveTo(1, 5, 3, 1);
		System.out.println(r1.getParameter());
		System.out.println(r2.getParameter());
	    System.out.println(r1.isSquare());
	    System.out.println(r2.isSquare());		     
		
	}

}

