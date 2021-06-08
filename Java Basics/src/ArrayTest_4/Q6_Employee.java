package ArrayTest_4;

import java.util.Scanner;

public class Q6_Employee {

	
	int eid;
	String enme;
	int mgid;
	
	
	
	
	public Q6_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	




	public Q6_Employee(int eid, String enme, int mgid) {
		super();
		this.eid = eid;
		this.enme = enme;
		this.mgid = mgid;
	}






	public int getEid() {
		return eid;
	}






	public void setEid(int eid) {
		this.eid = eid;
	}






	public String getEnme() {
		return enme;
	}






	public void setEnme(String enme) {
		this.enme = enme;
	}






	public int getMgid() {
		return mgid;
	}






	public void setMgid(int mgid) {
		this.mgid = mgid;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Q6_Employee emp[] = new Q6_Employee[5];
		
		Scanner sc = new Scanner(System.in);
		 
		for(int i = 0 ; i < emp.length ; i++)
		{
			emp[i] = new Q6_Employee();
			
			emp[i].setEid(sc.nextInt());
			emp[i].setEnme(sc.next());
			emp[i].setMgid(sc.nextInt());
			
		}
		
		
		for(int i = 0 ; i < emp.length ; i++)
		{
			for(int j = 0 ; j <emp.length ; j++)
			{
				if(emp[i].getMgid() == emp[j].getEid())
				{
					System.out.println("Employee "+emp[i].getEnme()+"  Manager "+emp[j].getEnme());
				}
			}
			
		}
		
		

	}

}
