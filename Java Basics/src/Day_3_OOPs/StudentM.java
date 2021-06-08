package Day_3_OOPs;

import java.util.Scanner;

public class StudentM {
	
	String name;
	int age;
	int m1,m2,m3;
	int maximum;
	double average;
	
	

	public StudentM(String name, int age, int m1, int m2, int m3) {

		this.name = name;
		this.age = age;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	
	}

	public StudentM() {
		// TODO Auto-generated constructor stub
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Name , Age , marks 1 , marks 2 , marks 3");
		name = sc.next();
		age = sc.nextInt();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	
	public void compute()
	{
		average = (m1 + m2 + m3)/3;
		
		if (m1 > m2 && m1 > m3)
		{
			maximum = m1;
		}else if(m2 > m1 && m2 > m3)
		{
			maximum = m2;
		}else
		{
			maximum = m3;
		}
	}
	
	public void display() {
		
		System.out.println("----Details----");
		System.out.println("Name : "+name+" Age :"+age);
		System.out.println("Marks : Subject 1 :"+m1+" Subject 2 : "+m2+" Subject 3 :"+m3);
		System.out.println("Average Marks :"+average);
		System.out.println("Maximum :"+maximum);
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		StudentM m = new StudentM("Faiz", 25, 25, 30, 25);
		m.compute();
		m.display();
		
		StudentM m2 = new StudentM();
		
		m2.accept();
		m2.compute();
		m2.display();
		
		
	}

}
