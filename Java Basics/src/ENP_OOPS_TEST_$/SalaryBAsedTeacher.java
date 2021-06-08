package ENP_OOPS_TEST_$;

public class SalaryBAsedTeacher extends Teacher {
	
	int salary;

	
	public SalaryBAsedTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}







	public SalaryBAsedTeacher(int salary) {
		super();
		this.salary = salary;
	}




	@Override
	void salary() {

		System.out.println("Monthly Salary :"+salary);
	}
	
	public static void main(String[] args) {
		
		
		HourlyBasis h = new HourlyBasis(40, 40);
		SalaryBAsedTeacher s = new SalaryBAsedTeacher(40000);
		h.salary();
		s.salary();
		
		
		
		Teacher t = new HourlyBasis(10, 23);
		Teacher t1 = new SalaryBAsedTeacher(7000);
		t.salary();
		t1.salary();
		
		
		
	}

}
