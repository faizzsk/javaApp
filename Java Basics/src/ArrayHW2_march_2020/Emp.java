package ArrayHW2_march_2020;

public class Emp { 
	
	int eid;
	String name;
	Dept d;
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String name, Dept d) {
		super();
		this.eid = eid;
		this.name = name;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", d=" + d + "]";
	}
	
	

}
