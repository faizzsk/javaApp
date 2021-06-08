package Assignment_5;

public class Dept {
	
	private int dept_id ;
	private String Dept_name;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		Dept_name = dept_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
	
	

}
