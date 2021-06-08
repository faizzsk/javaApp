package Day_3_OOPs;

import java.util.Scanner;

public class Calculator {
	
			int num1 , num2 ;
			float n1,n2;
			void accept() {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Number 1 and Number 2");
				
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				
				n1 = num1;
				n2 = num2;
			}
			
			int add()
			{
				return num1 + num2;
			}
			
			double div()
			{
				return n1/n2;
			}
			
			void sub()
			{
				System.out.println("Sub :"+(num1-num2));
			}
			
			void mult()
			{
				System.out.println("Multiplication :"+ num1 * num2);
			}
			
			
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calculator c1 = new Calculator();
		
		c1.accept();
		System.out.println("Addition :"+c1.add());
		c1.sub();
		System.out.println("division :"+c1.div());
		c1.mult();

	}

}
