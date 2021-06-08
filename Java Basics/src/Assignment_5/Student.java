package Assignment_5;

public class Student {
	
	private int rn;
	private String name;
	private Department dep;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rn, String name, Department dep) {
		super();
		this.rn = rn;
		this.name = name;
		this.dep = dep;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	
	
}
