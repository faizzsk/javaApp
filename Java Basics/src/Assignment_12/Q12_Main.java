package Assignment_12;

import java.util.ArrayList;
import java.util.Scanner;

class Emp
{
	int id;
	String name;
	int sal;
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
}
public class Q12_Main {

	public static void main(String[] args) {

	//	Emp e = new Emp(1, "Faiz", 50000);
		Emp[] e = new Emp[3];
		ArrayList<Emp> emp1 = new ArrayList<Emp>();

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < e.length ; i++)
		{
			e[i] = new Emp(sc.nextInt(), sc.next(), sc.nextInt());
			emp1.add(e[i]);

		}
		
		
		//q12 q13
		//System.out.println(emp1);
		
		//Q14
		
		for (int i = 0; i < emp1.size(); i++) {
			
			if(emp1.get(i).getSal() > 10000)
			{
				//for(Emp a : emp1)
				System.out.println(emp1.get(i));
			}
			
		}
		
		//Q15
		for (int i = 0; i < emp1.size(); i++) {
			
			if(emp1.get(i).getName().equalsIgnoreCase("Sachin"))
			{
				//for(Emp a : emp1)
				System.out.println(emp1.get(i));
			}
			
		}
		
		
		
		//Q16
		Emp temp1 = emp1.get(0);

		int f=0;
		for (int i = 0; i < emp1.size()-1; i++) {
			//int f=0;
			int temp = emp1.get( i).getSal();
			
				if(temp < emp1.get(i+1).getSal())
				{   
				
					//temp = emp1.get(i+1).getSal();
					temp1=emp1.get(i+1);
					System.out.println(emp1);

				}
			
						//System.out.println(temp);
				
			}
		System.out.println("Highest Salary : "+temp1);

		}
		

		
		
	}


//