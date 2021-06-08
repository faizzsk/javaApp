package Assignment_9;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
	
	

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String ar[]=s.split(" ");

		System.out.println("Enter the word to count occurance");
		String word=sc.next();
		
		
		
		int cnt=0;
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(word.equalsIgnoreCase(ar[i]))
			
				cnt++;
			
		}
		
		System.out.println(word+"  occur "+cnt+" times");
		

		/*
		String s="faiz faiz faiz shaikh";
		String arr[]=s.split(" ");
		int flag=0;
		int cnt=0;

		for(int i = 0 ; i < arr.length ; i++)
		{
		//	int count=0;


			for(int j = 0 ; j < arr.length;j++)
			{		
				if(arr[i]==(arr[j]) && j<i)
				{
					break;
			}else if(arr[i]==arr[j])
			{
				cnt++;
			}
			}
			if(cnt>0)
			{
				System.out.println(arr[i]+" "+cnt);

			}

		}
		
	
		
		
	/*	for(int i=0;i<s.length();i++)
		{	
			
			int cnt=1;

			char ch = s.charAt(i);
			for(int j = i+1 ; j < s.length() ; j++)
			{
				char ch1 = s.charAt(j);
				
				if(ch == ch1)
				{
					cnt++;
					
				}
			}
			if(cnt>1)
			{
			System.out.println(i+"th Element's Occurance "+ch+" +:"+cnt);}
		}
		
		*/
		
		
		
	}

}
