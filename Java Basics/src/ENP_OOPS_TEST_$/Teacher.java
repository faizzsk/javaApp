package ENP_OOPS_TEST_$;

abstract public class Teacher {
	
	
	int tid;
	String tname;
	long mobile;
	
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Teacher(int tid, String tname, long mobile) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mobile = mobile;
	}


	abstract void salary();
}
