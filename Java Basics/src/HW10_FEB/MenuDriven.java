package HW10_FEB;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {

		
		
		int ch;
		
		System.out.println("1. Samsung.........2.Apple...........3.MI");
		System.out.println("Enter Your Choice");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		
		switch(ch)
		{
		case 1 : int model;
				 System.out.println("1.Galaxy M31..2.Galaxy M51.......3.Galaxy M21");
				 System.out.println("Enter Your Choice");
				 model = sc.nextInt();
				
				 switch(model)
				 {
				 case 1 : System.out.println("Price : 18999 Rs");
				 		  break;
				 		  
				 case 2 : System.out.println("Price is : 24999 Rs");
				 		  break;
				 
				 case 3 : System.out.println("Price is : 15999 Rs");
				          break;
				 default: System.out.println("Enter Valid Model code");
				 
				 }
				 break;
				 
		case 2 : 	int modelA;
		 			System.out.println("1.I phone 12 Pro......2.I phone 12 mini.......3.I phone 11");
		 			System.out.println("Enter Your Choice");
		 			modelA = sc.nextInt();
		
		 			switch(modelA)
		 			{
		 				case 1 : System.out.println("Price : 127000 Rs");
		 							break;
		 		  
		 				case 2 : System.out.println("Price is : 64490 Rs");
		 							break;
		 
		 				case 3 : System.out.println("Price is : 51999 Rs");
		 							break;
		 				default: System.out.println("Enter Valid Model code");
		 
		 			}
		 				break;
		 			
		case 3 : 	int modelM;
					
					System.out.println("1.Redmi Note 9......2.Mi 10 T 5G.......3.Xiomi Mi 10i");
					
					System.out.println("Enter Your Choice");
					modelA = sc.nextInt();

					switch(modelA)
					{
						case 1 : System.out.println("Price : 17499 Rs");
									break;
				  
						case 2 : System.out.println("Price is : 32999 Rs");
									break;
		
						case 3 : System.out.println("Price is : 24999 Rs");
									break;
						default: System.out.println("Enter Valid Model code");
		
					}
						break;
					
		}
		
		
	}

}
