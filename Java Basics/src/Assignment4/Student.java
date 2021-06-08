package Assignment4;

public class Student {

	String name;
	int age;
	String addrs;
	
	
	public void set_info(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void set_info(String name , int age , String addrs)
	{
		this.name = name;
		this.age=age;
		this.addrs = addrs;
	}
	
	public void print()
	{
		System.out.println(name+"--"+age+"--"+addrs);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.set_info("FAiz", 25);
		s.set_info("Q", 2, "hehe");
		s.print();
		
		
		
	}

}
