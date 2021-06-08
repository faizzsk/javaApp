package ArrayHW2_march_2020;

import java.util.Scanner;

public class Dept {
	
	
	int deptid;
	String name;

	public Dept(int deptid, String name) {
		super();
		this.deptid = deptid;
		this.name = name;
	}
	
	

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", name=" + name + "]";
	}



	public static void main(String[] args) {

		Emp e[] = new Emp[2];
		Dept[] d=new Dept[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <e.length ; i++)
		{
			System.out.println("Enter Dept id and dept NAme");
			d[i] = new Dept(sc.nextInt(), sc.next());
			System.out.println("Enter eid and ename ");
			
			e[i]= new Emp(sc.nextInt(), sc.next(), d[i]);
		}
		
		
		for(int i = 0 ; i < e.length ; i++)
		{
			System.out.println(e[i]);
			
		}
		
	}

}
