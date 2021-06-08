package ENP_OOPS_TEST_$;

public class Developer {
	
	String devName;
	int devExp;
	String skills;
	
	public void debugApp()
	{
		System.out.println("Developer Debug Method");
	}
	
	public void integratedCode()
	{
		System.out.println("Developer integratedCode method");
	}


	public Developer(String devName, int devExp, String skills) {
		super();
		this.devName = devName;
		this.devExp = devExp;
		this.skills = skills;
	}

	
}
