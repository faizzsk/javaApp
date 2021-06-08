package Assignment2;

import java.util.Scanner;

public class Salary {
	
		
			public static void main (String [] args)
			{
					double basicSal;
					double grossSal=0;
					
				//	int pf=0 , hra=0;
					
					System.out.println("Enter Your Basic Salary : ");
					
					Scanner sc = new Scanner(System.in);
					
					basicSal = sc.nextInt();
					
						if (basicSal <= 10000)
						{
								grossSal = basicSal + (basicSal * 0.2 * 0.8) ;
						}
					
						else if (basicSal > 10000 && basicSal <= 20000)
						{
								grossSal = basicSal + (basicSal * 0.25 * 0.90) ;
						}
						
						else if (basicSal > 20000 )						
						{
								grossSal = basicSal + (basicSal * 0.3 * 0.95);
						}
						
						else
						{
							//	System.out.println("Wrong Input");
								grossSal = basicSal;
						}
					
					
					System.out.println("Your Salary : "+grossSal);
			}
}
