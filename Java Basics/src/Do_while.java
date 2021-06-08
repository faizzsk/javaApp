import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {

		
		
		
		
		int a,b;
		int sum;
		int ch;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("enter number 1");
			a = sc.nextInt();
			System.out.println("enter number 2");
			b = sc.nextInt();
		
			sum = a + b ;
			System.out.println("Sum is :"+sum);
			
			System.out.println("Do u Want to continue ? type 0 or 1 ");
			ch = sc.nextInt();
		}while(ch != 0);
		
		
		
		
	}

}
