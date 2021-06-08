package StringWeeklyTest2_20_03_2021;

import java.util.Scanner;

public class Q4 {

	
	public static void main(String[] args) {
		
		String[] rs = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
         
        int[] d = {100, 90, 50, 40, 10, 9, 5, 4, 1};
         
        Scanner sc = new Scanner(System.in);
         
         
        System.out.println("Enter The Decimal Number Between 1 and 100");
         
     //   int inputNumber = sc.nextInt();
       int num=12;           
         
        String roman = "";
         
        if (num >= 1 && num <= 100)
        {
            for (int i = 0; i < 9; i++) 
            {
                while(num >= d[i])
                {
                    num = num - d[i];
                     
                    roman = roman + rs[i];
                    
                    
                    
                    //= num = 55;
                    //= while 55>=d[i]==> d[6]=50
                    //=num = 55 - 50 = 5
                    //=roman = roman + rs[6]==> L
                    //=roman : L
                    //
                    //num = 5;
                    //while 5>=d[10];=5
                    //num = 5-5=0;
                    //roman = L + rs[10];=>V
                    //roman : LV
                    //
                    //
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }
            }
             
            System.out.println("Roman Equivalent is: "+roman);
        }
        else
        {
            System.out.println("Invalid Number");
        }
			
			
		}
		
		
		
		
		
	

}
