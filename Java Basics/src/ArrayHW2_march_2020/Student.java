package ArrayHW2_march_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	
	
	int sid;
	String name;
	String[] hobby;
	
	public Student() {
	}
	
	public Student(int sid, String name, String[] hobby) {
		super();
		this.sid = sid;
		this.name = name;
		this.hobby = hobby;
	}
	
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", hobby=" + Arrays.toString(hobby) + "]";
	}

	public static void main(String[] args) {

		Student [] s = new Student[2];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < s.length; i++)
		{
			System.out.println("Enter id Name ");
		
			s[i] = new Student();
		
			s[i].setSid(sc.nextInt());
			
			s[i].setName(sc.next());
			
			System.out.println("enter 3 hobbies");

			String [] h = new String[3];
			
			for(int j = 0 ; j < 3 ; j++)
			{
				h[j]= sc.next();
			}
			
			s[i].setHobby(h);
			
		}
	
		
		
		System.out.println(Arrays.toString(s));
	}

}
