package Assignment_8;

import java.util.Arrays;
import java.util.Scanner;

public class Student_q3 {

	
	int id;
	String name;
	Boolean isspl;
	Course[] c;
	
	
	



	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Student_q3 [id=" + id + ", name=" + name + ", isspl=" + isspl + ", c=" + Arrays.toString(c) + "]";
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

	public Boolean getIsspl() {
		return isspl;
	}

	public void setIsspl(Boolean isspl) {
		this.isspl = isspl;
	}









	public Course[] getC() {
		return c;
	}









	public void setC(Course[] c2) {
		this.c = c2;
	}









	public static void main(String[] args) {

		
		Student_q3 stu [] = new Student_q3[2];
		Course c[] = new Course[1];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < stu.length ; i++)
		{
			stu[i] = new Student_q3();
		System.out.println("Enter id,name,");
			stu[i].setId(sc.nextInt());
			stu[i].setName(sc.next());
		//	stu[i].setIsspl(sc.);
			
			for(int j = 0 ; j < c.length ; j++)
			{
				c[j]=new Course();
				System.out.println("course name fees");
				c[j].setName(sc.next());
				c[j].setFees(sc.nextInt());
				if(c[j].getFees()>50000)
				{
					stu[i].setIsspl(true);
				}else
				{
					stu[i].setIsspl(false);
			
				}
				
			stu[i].setC(c);
			
			}
			
		}
		
		
//		for(int i = 0 ; i  < stu.length; i++)
//		{
//			
//			System.out.println(stu[i]);
//			
//		}
//		
		
		
		
		
		
		//boolean b =true;
		
//			for(int j = 0 ; j<c.length;j++)
//			{
//			if(c[j].getFees() >= 50000)
//			{
//				stu[j].isspl=true;
//			}else {
//				stu[j].isspl=false;
//			}
//				System.out.println(stu[j]);
//			}
//		
		System.out.println(Arrays.toString(stu)+" ");
		
		
	}

}
