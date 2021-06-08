package Array_Weekly_Test_4_6_March;

import java.util.Arrays;
import java.util.Scanner;

import AlphabetPattern.C;

public class Course {

	int cid;
	String name;
	Student stud[];
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	public int getCid() {
		return cid;
	}




	public void setCid(int cid) {
		this.cid = cid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Student[] getStud() {
		return stud;
	}




	public void setStud(Student[] stud) {
		this.stud = stud;
	}




	public Course(int cid, String name, Student[] stud) {
		super();
		this.cid = cid;
		this.name = name;
		this.stud = stud;
	}




	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", stud=" + Arrays.toString(stud) + "]";
	}




	public static void main(String[] args) {
		Course [] obj = new Course[12;
		Student stud[] = new Student[3];

		//Course obj1 = new Course();
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < obj.length;i++)
		{
			
			obj[i]= new Course();
			System.out.println("Enter course id , name ");
			obj[i].setCid(sc.nextInt());
			obj[i].setName(sc.next());
			
			for(int j = 0 ; j < stud.length;j++) 
			{
			stud[j]= new Student();
			System.out.println("Enter Stud id , name , city");
			stud[j].setSid(sc.nextInt());
			stud[j].setName(sc.next());
			stud[j].setCity(sc.next());
			
			}
			
			obj[i].setStud(stud);
		}
		
			//if(stud.getCity().equalsIgnoreCase("Pune"))
			//{
				//System.out.println(obj1.toString());
		//	}
		
		for(int i = 0 ; i < obj.length; i++)
		{
			for(int j = 0 ; j< stud.length;j++)
			{
				if(stud[j].getCity().equalsIgnoreCase("Pune"))
				{
					System.out.println(stud[j]);
				}
			}
		}
		
		
		
		
	}

}
