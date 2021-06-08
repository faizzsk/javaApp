package Weekly_Test_03_04_2021;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Emp{
	
	int id;
	String name;
	Dept d;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, Dept d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
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
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", d=" + d + "]";
	}
	
	
	
	
	
}
public class Q4 {

	public static void main(String[] args) {

		Emp [] emp = new Emp[3];
		LinkedList<Emp> ll = new LinkedList<Emp>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < emp.length;i++)
		{
			System.out.println("Enter emp Id, Name");
			emp[i] = new Emp();
			emp[i].setId(sc.nextInt());
			emp[i].setName(sc.next());
			
			Dept d = new Dept();
			d.setId(sc.nextInt());
			d.setDeptName(sc.next());
			emp[i].setD(d);
			ll.add(emp[i]);
		}
		
		
		Iterator<Emp> itr = ll.iterator();
		
		//int i=0;
	
//		for(int i=0; i < ll.size();i++)
//		{
//			if(ll.get(i).getId()==10)
//			{
//				//System.out.println(ll.get(i));
//				String dname = ll.get(i).getD().getDeptName();
//				
//				if(ll.get(i).getD().getDeptName().equals(dname))
//				{
//					ll.remove(i);
//					i--;
//					
//				}
//			}
//		}
//		
	String dname="";
	
	for(Emp p : ll)	
	{
		if(p.getId()==10)
		{
			dname = p.getD().getDeptName();
			break;
		}
	}
	while(itr.hasNext())
	{
		Emp temp = itr.next();
		
		if(temp.getD().getDeptName().equalsIgnoreCase(dname))
		{
			itr.remove();
		}
	}
		
		System.out.println(ll);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
