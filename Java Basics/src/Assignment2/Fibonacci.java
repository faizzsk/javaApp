package Assignment2;

public class Fibonacci {

	public static void main(String[] args) {

		
		int a = 0 ,  b = 1 , c = 0 ;
		
			
		System.out.print(""+a+" "+b+" ");
			
				for(int i = 2 ; i <= 20 ; i++)
				{					
				
						
					c = a + b;

							//if(c<50)
							//{
					
									System.out.print(" "+c);

							//}
							
					a = b ;
					b = c ;
				}
		
	}

}
