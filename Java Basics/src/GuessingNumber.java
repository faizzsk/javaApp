import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {

		int cumputer_number = (int) (Math.random()*10);
		int number;
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println(number);
		int c=0;
		
		while(c<=3)
		{			c++;
		
			System.out.println("Enter your gusseing");
			number = sc.nextInt();

			if(number < cumputer_number)
			{
				System.out.println("Computer number is grater than your number");
				//break;
			}
			else if(number > cumputer_number)
			{
				System.out.println("Your number is greater than computer's number..choose small one");
			//break;
			}
			else if(number == cumputer_number)
			{
				System.out.println("You Won");
				System.out.println("Correct number was"+cumputer_number);
			///break;
			}else
			{
				System.out.println("You lost...The correct number is"+cumputer_number);
				//break;
			}
		
		}
		
		System.out.println("Correct number was"+cumputer_number);
		
		
		
		
		
		
		
		

	}

}
