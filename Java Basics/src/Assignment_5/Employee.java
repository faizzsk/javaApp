package Assignment_5;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary, Dept dep, Mydate mydate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
		this.mydate = mydate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private Dept dep;
	private Mydate mydate;

	public Employee() {
	
	}

	public Employee(int id, String name, Dept dep, Mydate mydate) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.mydate = mydate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dept getDep() {
		return dep;
	}

	public void setDep(Dept dep) {
		this.dep = dep;
	}

	public Mydate getMydate() {
		return mydate;
	}

	public void setMydate(Mydate mydate) {
		this.mydate = mydate;
	}

	
	
	
	
	
	
}
