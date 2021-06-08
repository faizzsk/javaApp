package Assignment_8;

import java.util.Arrays;
import java.util.Scanner;

public class Department {

	
	int dept_id;
	String name;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		Employee[] emp=new Employee[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			System.out.println("eid ename");
			emp[i].setEmpno(sc.nextInt());
			emp[i].setName(sc.next());
			System.out.println("did dname");
			Department d = new Department();
			d.setDept_id(sc.nextInt());
			d.setName(sc.next());
			emp[i].setD(d);
			
		}
		
		int flag=1;
		for(int i = 0 ; i < emp.length;i++)
		{
			for(int j = i+1; j<emp.length;j++)
			{
				if(emp[i].getD().getDept_id()!=emp[j].getD().getDept_id())
				{
					System.out.println(emp[i]);

					flag=1;
					//break;
				}
			}
			if(flag==1)
			{
			}
		}
		
		
		
		
		//for(int i =0 ; i < emp.)
		//printing whole array
		System.out.println(Arrays.toString(emp));
	}
}
