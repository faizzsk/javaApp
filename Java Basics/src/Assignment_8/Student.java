package Assignment_8;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	
	
	int sid;
	String name;
	int age;
	int marks;
	
	public Student(int sid, String name, int age, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
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


	
	

	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		Student [] s = new Student[5];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < s.length; i++)
		{
			System.out.println("Enter id Name age marks ");
		
			s[i] = new Student();
		
			s[i].setSid(sc.nextInt());
			
			s[i].setName(sc.next());
			
					
			s[i].setAge(sc.nextInt());
			s[i].setMarks(sc.nextInt());
			
		}
		
		
		for(int i = 0  ; i<s.length ; i++)
		{
			for(int j = 0; j<s.length-1;j++)
			{
				//if((s[i].getName().charAt(k))==(s[j].getName().charAt(k)))
				//{
				//k++;
				//}
			

				//	 if(s[i].getName().charAt(k) == s[j].getName().charAt(k))
				// {
				// k++;
				//	 }
				/*
				 if(s[i].getName().charAt(k)> s[j].getName().charAt(k))
				{
					Student temp = s[i];
					s[i] = s[j];
					s[j] =temp;
				}
				 */
				if(s[j].getName().compareTo(s[j+1].getName())>0)
				{
					Student temp = s[j];
					s[j] = s[j+1];
					s[j+1] =temp;
				}

			}
				//System.out.println(s[i]);
			}

		
		System.out.println(Arrays.toString(s));
		//System.out.println(Arrays.toString(s));
		
		System.out.println("-------Age And Marks--------");
		for(int i = 0 ; i < s.length ; i++)
		{
			if(s[i].getMarks() > 60 && s[i].getAge()<15)
			{
				System.out.println(s[i]);
			}
		}
		
	
	}

}
// Q 14 = > sort by name
// Q 13 = > marks and age display