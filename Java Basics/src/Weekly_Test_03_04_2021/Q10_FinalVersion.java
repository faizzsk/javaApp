package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q10_FinalVersion {
			

	public static void main(String[] args) {

			ArrayList<String> kkk = new ArrayList<String>();
			ArrayList<Integer>rrr = new ArrayList<Integer>();
   		
		
		   int[] d = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
			
		   
		   char[] rs = {'0','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	        
	       Scanner sc = new Scanner(System.in);
	         
	         
	         

	       String num="the sky is the limit";
	       String [] str = num.split(" ");
	         
	       String roman = "";
	   	   String dd="";
	        
	   		int k =0;
	   
	   		Map<Integer, String> mp = new HashMap<Integer, String>();

	   	//	HashMap<Integer, String> kkk = new HashMap<Integer, String>(3);
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
	   				
	   				kum = ""  + d[k];
	   				
	   				k=0;
	   			
	   		
	   				int tt = Integer.parseInt(kum);
	   				sum = sum+tt;
	   				System.out.println(""+sum);
	   			}
	   			
	   			kkk.add(out);
	   			rrr.add(sum);
	   			mp.put(sum, out);

	   			System.out.println(out);
	   			System.out.println(sum);	
	   			System.out.println(kum);	
	   		}

	   		
	   		
	   		
	   		
	   //		Collections.sort(rrr);
	   		
	   		System.out.println(rrr);
	   		
	   		
	   		
	   		
	   		
	   		
	   		System.out.println(" "+kkk);
	   		System.out.println("va "+rrr);
	   	
	   	System.out.println(mp);
	   	Collections.sort(rrr);
	   	
	}

}
