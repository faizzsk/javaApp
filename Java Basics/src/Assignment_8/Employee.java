package Assignment_8;

public class Employee {
	
	int empno;
	String name;
	Department d;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", d=" + d + "]";
	}
	
	

}
