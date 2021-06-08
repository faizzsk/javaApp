package Assignment_1;

import java.util.Scanner;

public class DaysMonthsWeeks {

	public static void main(String[] args) {

		
		float days;
		
		double week,months,years;
		
		
		System.out.println("Enter Days");
		Scanner sc = new Scanner(System.in);
		
		days = sc.nextInt();
		
		
		week = days / 7 ;
		System.out.println("Week:"+week);
		
		months = days / 12;
		System.out.println("Months :"+Math.floor(months));
		
		years = days / 365;
		
		System.out.println("Years :"+Math.round(years));
		System.out.println();
		
		
		
	}

}
