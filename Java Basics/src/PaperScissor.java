import java.util.Scanner;

public class PaperScissor {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		char ch = 0;
		System.out.println("Enter your move");
		int user = sc.nextInt();
		String urmove;
		System.out.println("Enter oppent's move");
		int computer = (int) (Math.random()*3);
		String opponet;

		if(computer == 0 )
		{
			opponet = "Rock";
		}else if(computer ==1)
		{
			opponet = "Paper";
		}else
		{
			opponet = "Scissors";
		}


		if(user == 0 )
		{
			urmove = "Rock";
		}else if(user ==1)
		{
			urmove = "Paper";
		}else
		{
			urmove = "Scissors";
		}
		System.out.println(opponet);

		do {
			if(user<=2)
			{
				
				if(urmove.equals("Rock")==opponet.equals("Scissors"))
				{
					System.out.println(" User has won");
					break;
				}
				
				
				else if(urmove.equals("Scissors")==opponet.equals("paper"))
				{
						System.out.println("user has won");
						break;
				}
				
				else if(urmove.equals("Paper") == opponet.equals("Rock"))
				{
					System.out.println("user has won");
				}
			
				
				if(urmove.equals(opponet))
				{
					System.out.println(" oops it is tie");
				}
				else
				{
					System.out.println("user has lost");
				}


				
			}
			System.out.println("do u wanna quite press n else y");
			ch=sc.next().charAt(0);

		}while(ch!='n');
			



	}



}

	