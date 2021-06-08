package Array_Weekly_Test_4_6_March;

import java.util.Arrays;
import java.util.Scanner;

import Assignment_1.TotalMarks_percentage;

public class Q7 {
	
	int sid;
	String name;
	int marks;
	//static int total_marks;
	
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


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "Q7 [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {

		Q7 s[] = new Q7[5];
	//	int marks[]= new int[3];
			Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < s.length ; i++)
		{
			s[i] = new Q7();
			System.out.println("Enter id,name,marks");
			s[i].setSid(sc.nextInt());
			s[i].setName(sc.next());
			s[i].setMarks(sc.nextInt());
		}
		
		for(int i = 0 ; i < s.length ; i++)
		{
			for(int j = 0 ; j < s.length-1 ; j++)
			{
				if(s[j].getMarks() < s[j+1].getMarks())
				{
					Q7 m = s[j];
					s[j]= s[j+1];
					s[j+1] = m;
				}
			}
			System.out.println(s[i]);
		}
		System.out.println(Arrays.toString(s));
		
	}


	
}
