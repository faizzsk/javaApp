package Assignment_5;

public class Emp_Dept_Mydate_mainQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Mydate m = new Mydate(8, "April", 1994);
		Dept d = new Dept(2, "Account");
		Employee e = new Employee(1, "Shital",10000, d, m);
		
		
		System.out.println("------Employee Detail---------");
		
		System.out.println("Employee Id"+e.getId());
		System.out.println("Employee Name :"+e.getName());
		System.out.println("Employeee Salary: "+e.getSalary());
		System.out.println("Dept Id :"+d.getDept_id()+" "+"Dept Name :"+d.getDept_name());
		System.out.println("Joining Date:"+m.getDay()+"/"+m.getMonth()+"/"+m.getYear());
	}

}
