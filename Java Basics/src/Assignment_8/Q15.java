package Assignment_8;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {

	
	int sid;
	String name;
	int age;
	int marks;
	

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
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

	
	public static void sort(Q15 []s)
	{
		for(int i = 0 ; i < s.length ; i++)
		{
			for (int j = i+1 ; j < s.length ; j++)
			{
				if(s[i].getMarks() > s[j].getMarks())
				{
					Q15 temp = s[i];
					s[i]  = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	//	return s;
	}

	
	public static void show(Q15 [] q)
	{
		for(Q15 data:q)
		{
			System.out.println(data);
		}
	}
	
	

	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		Q15 [] a = new Q15[5];
	Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < a.length; i++)
		{
			System.out.println("Enter id Name  marks ");
		
			a[i] = new Q15();
		
			a[i].setSid(sc.nextInt());
			
			a[i].setName(sc.next());
			
					
			a[i].setMarks(sc.nextInt());
			
		}
	

		
		sort(a);
		show(a);
	}

	@Override
	public String toString() {
		return "Q15 [sid=" + sid + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

}
