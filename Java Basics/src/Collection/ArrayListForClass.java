package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
	
	 int id;
	 String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	 
	
}
public class ArrayListForClass {

	public static void main(String[] args) {

		Student s[] = new Student[3];
		ArrayList<Student> al = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < s.length ; i++)
		{
			s[i] = new Student(sc.nextInt(), sc.next());
			al.add(s[i]);
		}
		// remove
		for(int i = 0 ; i < s.length ; i++)
		{
			if(s[i].getName().equals("Faiz")) {
				
				al.remove(s[i]);
				//break;
			}
			
		}
	
		ArrayList<Integer> abc = new ArrayList<Integer>();
		Iterator<Integer> itr = abc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//index of
		//System.out.println(al.indexOf(s[1]));
		
		
	//System.out.println(al);	
	}

}
