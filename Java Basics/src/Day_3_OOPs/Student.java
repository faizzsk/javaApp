package Day_3_OOPs;

import java.util.Scanner;

public class Student {

	
		int sid;
		String name;
		long mobile;
	
		void accept()
		{
			System.out.println("----Accept Method-------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id , Name , Mobile");
			
			sid = sc.nextInt();
			name = sc.next();
			mobile = sc.nextLong();
			
		}
		
		
		void display()
		{
			System.out.println("----Display-----");
			System.out.println("Id :"+sid);
			System.out.println("Name :"+name);
			System.out.println("Mobile :"+mobile);

		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Student s1 = new Student();
			Student s2 = new Student();
		
					s1.sid=1;
					s1.name="Faizz";
					s1.mobile=9028925229l;
		
						System.out.println("Id :"+s1.sid);
						System.out.println("Name :"+s1.name);
						System.out.println("Mobile :"+s1.mobile);
		/*
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Student ID , Name , Mobile");
			s2.sid = sc.nextInt();
			s2.name = sc.next();
			s2.mobile = sc.nextLong();
			
			System.out.println("Id :"+s2.sid);
			System.out.println("Name :"+s2.name);
			System.out.println("Mobile :"+s2.mobile);
			
			*/
			Student s3 = new Student();
			
			System.out.println("ID :"+s3.sid);
			System.out.println("Name"+s3.name);
			System.out.println("Mobile :"+s3.mobile);
			
			
			Student s4 = new Student();
			s4.accept();
			s4.display();
			
			
			
			
			
			
			

			
			
			
		}

}
