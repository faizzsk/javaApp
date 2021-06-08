package enpTest;

public class RedBlue {

	public static void main(String[] args) {

		
		for (int i = 1 ; i <= 100 ; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("ReadBlue");
			}else if(i % 3 == 0)
			{
				System.out.println("Red");
			}else if(i % 5 == 0)
			{
				System.out.println("Blue");
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
	}

}
