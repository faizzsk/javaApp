package Assignment_8;

import java.util.Scanner;

import ArrayHW2_march_2020.Employee;

public class Q12_Employee {

	int id;
	String name;
	int sal;
	
	
	
	
	
	public Q12_Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		//this.emp = emp;
	}



	
	
	
	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getSal() {
		return sal;
	}






	public void setSal(int sal) {
		this.sal = sal;
	}






	@Override
	public String toString() {
		return "Q12_Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Q12_Employee emp[]=new Q12_Employee[3];

		for(int i = 0 ; i < emp.length ; i++)
		{
				System.out.println("Enter emp id ename, sal");

				emp[i]= new Q12_Employee(sc.nextInt(),sc.next(),sc.nextInt());
			
			
		}
		
		
		for(int i = 0 ; i < emp.length-1;i++)
		{
			for(int j = i+1 ; j < emp.length ; j++)
			{
				if(emp[i].getSal()==emp[j].getSal())
				{
					System.out.println(emp[i]+" "+emp[j]);

				}
				else
				{
					System.out.println(" ");
				}
			}
		}
		
		
		
		
		
	}

}
