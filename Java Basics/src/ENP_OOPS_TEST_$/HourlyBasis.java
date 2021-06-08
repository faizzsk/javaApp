package ENP_OOPS_TEST_$;

public class HourlyBasis extends Teacher {

	
	int rate_per_hr;
	int hrs;
	
	public HourlyBasis(int rate_per_hr, int hrs) {
		this.rate_per_hr = rate_per_hr;
		this.hrs = hrs;
	}

	@Override
	void salary() {
System.out.println("Total Salary :"+rate_per_hr*hrs);
		
	}
	
	
}
