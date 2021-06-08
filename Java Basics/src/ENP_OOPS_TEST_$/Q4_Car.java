package ENP_OOPS_TEST_$;

public class Q4_Car {
	
	int id;
	String color;
	Engine e;
	Gear g;
	
	public Q4_Car(int id, String color, Engine e, Gear g) {
		super();
		this.id = id;
		this.color = color;
		this.e = e;
		this.g = g;
	}
	
	
	@Override
	public String toString() {
		return "Q4_Car [id=" + id + ", color=" + color + ", e=" + e + ", g=" + g + "]";
	}
	public void display()
	{
		System.out.println(id+ "Color :"+color);
		System.out.println("Engine ID"+e.engineId+" LAst clean day:"+e.lastengineCleanDate);
		System.out.println("Sub engine type"+e.sub.type);
		System.out.println("Gear:"+g.gearType);
	}


	public static void main(String[] args) {
		Gear g = new Gear("DoubleTop");
		SubEngine sub = new SubEngine("760");
		Engine e = new Engine(12, "22/2/2020", sub);
		Q4_Car c = new Q4_Car(2, "Blue", e, g);
		c.display();
	}
	

}
