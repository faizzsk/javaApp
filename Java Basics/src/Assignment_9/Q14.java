package Assignment_9;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
	
	static boolean isDigit(char c)
	{
		if(c>='0' && c<='9')
		return true;
		else
		return false;
			
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String s1 = sc.next();
		//String s1="My 56 ffdfds20dgfg9gfg9";

		//System.out.println(s1.length());
		int total=0;
		char arr[]=s1.toCharArray();
		//{'M','y',' ','5','6',' ' }
		int count=0;
		//String s1="My 5687 ffdfds20dgfg9gfg9";
		
		//5687
		
		//20
		//9
		//9
		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			
			if(isDigit(c))
			{
				String digit=""+c;//"5"
				int j=i+1;
				while(j<arr.length && isDigit(arr[j]) )
				{ 
					digit=digit+arr[j];//"5"+"6"="56"
					j++;
					
				}
			  i=j;
			  count++;
			total=total+Integer.parseInt(digit);	
			}
			
			
			
		}
		
		System.out.println(total);
		System.out.println("avg "+total/count);//"90"
	}

		
		
		

		/*
		String str="Faih66gfg12345";
		double avg;
		int cnt=0;
		double num;
		double sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch =='0'||ch =='1'||ch =='2'||ch =='3'||ch =='4'||
					ch =='5'||ch =='6'||ch =='7'||ch =='8'||ch =='9')
			{
				cnt++;
				num = Character.getNumericValue(ch);
				sum = sum + num;
				
			}
		}
		System.out.println(cnt);
		System.out.println(sum);
		avg=(sum/cnt);
		System.out.println(avg);
		*/
		
		
	}


