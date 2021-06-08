package Assignment_5;

public class Department {

	private int id;
	private String dep_name;
	public Department() {
		super();

	}
	public Department(int id, String dep_name) {
	
		this.id = id;
		this.dep_name = dep_name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDep_name() {
		return dep_name;
	}
	
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	
	
	
}
