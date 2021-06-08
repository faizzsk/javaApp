package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int mark;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
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




	public int getMark() {
		return mark;
	}




	public void setMark(int mark) {
		this.mark = mark;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}


	@Override
	public int compareTo(Student o) {

		if(this.getMark() == o.getMark())
		{
			return this.getId() - o.getId();
		}
		else
		{	
			return o.getMark() - this.getMark();
		}
	}


	public static void main(String[] args) {
		
		ArrayList<Student> list  =new ArrayList<Student>();
		
			list.add(new Student(2, "Faizz", 100));
			list.add(new Student(1, "Nikita", 100));
			
		
			list.add(new Student(3, "Sneha", 40));
			list.add(new Student(4, "Mohit", 88));
			list.add(new Student(5, "Rahul", 99));
		
			Collections.sort(list);
			System.out.println(list);
		

	}





}
