package Weekly_Test_03_04_2021;

public class Dept {
	
	int id;
	String deptName;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + "]";
	}
	
	

}
