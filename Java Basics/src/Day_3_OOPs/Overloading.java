package Day_3_OOPs;

public class Overloading {
		
	int area;
	double circleA;
	
	 public void area (int l , int b)
	 {
		 area = l * b ;
		 System.out.println("Area Of recatnagle :"+area);
	 }
	
	 public void area(Double r)
	 {
		 circleA = 3.14 * r * r;
		 System.out.println("Area of Circle "+circleA);
	 }
	 
	 
	 public void area (int s)
	 {
		 area = s * s ;
		 
		 System.out.println("Area of Square "+area);
	 }
	
	
	public static void main(String[] args) {

		Overloading o = new Overloading();
		byte a = 10, b =10;
		short c = 5 , d = 4;
		o.area(a,b);
		o.area(c,d);
		o.area(7.5);
		
	}

}
