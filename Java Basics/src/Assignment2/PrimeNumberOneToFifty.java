package Assignment2;

public class PrimeNumberOneToFifty {

	public static void main(String[] args) {

		int num = 50;
		boolean check = true;
		// int check = 0;

		while(num >0)
		{
			for (int i = 2; i < num; i++) 
			{

					if (num % i == 0) 
					{
							check = false;
							break;
					} 
					else 
					{
							check = true;
					}

		   }

					if (check == true) 
					{
							System.out.println(""+num);
					} 
		
			num--;
	}

	
		
		
		
		
		
		
		
	}

}
