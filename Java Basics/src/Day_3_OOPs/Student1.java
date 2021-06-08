package Day_3_OOPs;

public class Student1 {

	
	int sId ;
	String name;
	int age;
	Address a1 = new Address();
	Trainer t1 = new Trainer();
	private Batch b1 = new Batch();
	
	
	
	  





	public Student1(int sId, String name, int age, Address a1, Batch b1) {
		super();
		this.sId = sId;
		this.name = name;
		this.age = age;
		this.a1 = a1;
		this.b1 = b1;
	}





	public Student1(int sId, String name, int age, Address a1) {
		this.sId = sId;
		this.name = name;
		this.age = age;
		this.a1 = a1;
	}





	public int getsId() {
		return sId;
	}





	public void setsId(int sId) {
		this.sId = sId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getA1() {
		return a1;
	}


	public void setA1(Address a1) {
		this.a1 = a1;
	}
	
	
	
	public void display()
	{
		System.out.println("Sid :"+sId);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println(" addrs :"+a1.getAddress());
		System.out.println("city :"+a1.getCity());
		System.out.println("Pin code :"+a1.getPinCode());
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Address a1 = new Address(422470, "Kalwwan", "DSK");
		Student1 s = new Student1(2, "shital", 25, a1);
		//Batch b1 = new Batch(, batchName, t)
		s.display();
		
	}
}
