package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
	
	
        int[] d = {0,1,2,3,4,5,6,7,8,9,10};
	
		char[] rs = {'0','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        
        
         
        Scanner sc = new Scanner(System.in);
         
         
         
     //   int inputNumber = sc.nextInt();

       String num="fai fai";
       String [] str = num.split(" ");
       char [] ch= num.toCharArray();
         
        String roman = "";
   		String dd="";
        
   		int k =0;
   		for(int i = 0 ; i < str.length ; i++)
   		{
   			char pp= num.charAt(i);
   			if(pp !=' ') {
   			while(pp != rs[k])
   			{
   				k++;
   			}
   			}
   			
   			
   			roman = roman+ d[k];
   			k=0;
   		}
   		
   		int n = Integer.parseInt(roman);
   		int sum = 0 ;
   		while(n > 0)
   		{
   			int r = n % 10;
   			sum = sum + r;
   			n = n/10;
   			
   		}
   		
   		
   		
   		System.out.println(num+" "+sum);
   		
   		
		
		
		
		
		
		
		
	}

}
