
package Assignment_5;

import java.util.Scanner;

public class Person_Job_Joining_Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		JoiningDate j = new JoiningDate();
		System.out.println(" Enter day Month year:");
		j.setDay(sc.nextInt());
		j.setMonth(sc.next());
		j.setYear(sc.nextInt());
		
		System.out.println("Enter Job id job profile :");
		Job job = new Job(sc.nextInt(), sc.next(),j);
		System.out.println("Enter id name ");
		Person p = new Person(sc.nextInt(), sc.next(), job);
		
		System.out.println("ID : "+p.getId()+" Name :"+p.getName());
		System.out.println("Job Id :"+job.getId()+" Profile"+job.getProfile());
		System.out.println("Joining Date :"+j.getDay()+"/"+j.getMonth()+"/"+j.getYear());
		
		
		
		
		
	}

}
