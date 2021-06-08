package Assignment_1;

import java.util.Scanner;

public class TotalMarks_percentage {

	public static void main(String[] args) {

		
		int m1,m2,m3,m4,m5;
		int total;
		int total_marks=500;
		double per;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Makrs");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		total = m1 + m2 + m3 + m4 + m5;
		
		per = (total*100)/500;
		
		System.out.println("Marks : "+total);
		System.out.println("Percentage :"+per);
		
		
		
		
		
		
		
	}

}
