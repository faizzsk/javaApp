package ENP_OOPS_TEST_$;

import Day_3_OOPs.MobileApplication;

public class Application {
	
	int version;
	String technologyUsed;
	Developer d;
	
	public void install()
	{
		System.out.println("in Application install method");
	}

	public void unistall()
	{
		System.out.println("in Application uninstall method");
	}

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(int version, String technologyUsed, Developer d) {
		super();
		this.version = version;
		this.technologyUsed = technologyUsed;
		this.d = d;
	}
	
	
	@Override
	public String toString() {
		return "Application [version=" + version + ", technologyUsed=" + technologyUsed + ", d=" + d + "]";
	}

	public static void main(String[] args) {
		
		Developer d = new Developer("SNeha", 4, "JAVA");
		Application a = new Application(1, "JAVA", d);
		Application a1= new DesktopApplication();
		Application a2 = new WebApplication();
	Application a3 = new MobileApplication();
		
	
	DesktopApplication d1 = new DesktopApplication();
	WebApplication w = new WebApplication();
MobileApplication m = new MobileApplication();
	

		
	}
}
