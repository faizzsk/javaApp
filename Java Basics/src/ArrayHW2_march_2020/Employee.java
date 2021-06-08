package ArrayHW2_march_2020;

import java.util.Scanner;

public class Employee {

	
	private int eid;
	String ename;
	long salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		
		
		Employee [] a  = new Employee[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <a.length;i++)
		{
			  a[i]=new Employee();
			  
			  a[i].setEid(sc.nextInt());
			  
			  a[i].setEname(sc.next());
			  
			  a[i].setSalary(sc.nextLong());
		}
		
		for(int i = 0 ; i<a.length;i++)
		{
			
			if(a[2].getSalary() == a[i].getSalary())
			{
				System.out.println(a[i]);
			}
		}
		
		
	}
}
