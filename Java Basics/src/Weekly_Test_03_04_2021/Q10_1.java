package Weekly_Test_03_04_2021;

import java.util.Scanner;

public class Q10_1 {

	public static void main(String[] args) {

		   int[] d = {0,1,2,3,4,5,6,7,8,9,10};
		
			char[] rs = {'0','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	        
	        
	         
	        Scanner sc = new Scanner(System.in);
	         
	         
	         
	     //   int inputNumber = sc.nextInt();

	       String num="fai fai abc";
	       String [] str = num.split(" ");
	       //char [] ch= .toCharArray();
	         
	        String roman = "";
	   		String dd="";
	        
	   		int k =0;
	   
	   		
	   		for(int i = 0 ; i < str.length ; i++)
	   		{
	   			int sum=0;
	   			String sin = str[i];
	   			String kum = "";
	   			String out = "";
	   			for(int j = 0 ; j < sin.length() ; j++)
	   			{
	   				char ch1 = sin.charAt(j);
	   				
	   				while(ch1 != rs[k])
	   				{
	   					k++;
	   				}
	   				out = out + rs[k];
	   				kum = kum + d[k];
	   				k=0;
	   				
	   				
	   			}
	   			int woo = Integer.parseInt(kum);
   				while(woo>0)
   				{
   					int r = woo % 10;
   					sum = sum + r;
   					woo = woo / 10;
   				}
   			System.out.println(out);
	   		System.out.println(sum);	
	   		System.out.println(kum);	
	   		}
	   		
	   		
	   		
////	   		int n = Integer.parseInt(roman);
////	   		int sum = 0 ;
////	   		while(n > 0)
////	   		{
////	   			int r = n % 10;
////	   			sum = sum + r;
////	   			n = n/10;
////	   			
////	   		}
////	   		
//	   		
//	   		
//	   		System.out.println(num+" "+sum);
//
		
		
		
	}

}
