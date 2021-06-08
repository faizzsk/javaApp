import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {

		int num ;
		String s = "";
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();
		
		int n =num;

		int cnt=0;
		while(num > 0)
		{
			num = num / 10;
			cnt++;
		}
		
		
		if (cnt > 3 || cnt < 3)
		{
			System.out.println("Enter valid number");
			
		}
		
		

			for(int i = 1 ; i <=3 ; i++)
			{
				 int ab = n*i;
				 s = s + ab;

			}
			System.out.println(s);

		

		int p=Integer.parseInt(s);  
		
		int f=p;

		System.out.println("intiger"+p);

		for(int i = 0 ; i<10 ; i++)
		{		int cct=0;

			p=f;
			while(p > 0)
			{
				int r = p%10;
				
				if(r ==i)
				{
					cct++;
				}
				p=p/10;
			}
			if(cct > 1)
			{
				System.out.println("NOt a fascinating number");
				break;
			}
			else
			{
				System.out.println("Fascinating Number");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
