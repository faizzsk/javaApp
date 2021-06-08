package Assignment_6;


	abstract class Car{
	public abstract void start();
}




public class Car_q3 extends Car{

	@Override
	public void start() {
		System.out.println("user just need to start the car by pressing start button....without worrying how is going to start");
		
	}
	
	public static void main(String[] args) {

		
		
		Car_q3 c = new Car_q3();
		c.start();
	}

	

}
