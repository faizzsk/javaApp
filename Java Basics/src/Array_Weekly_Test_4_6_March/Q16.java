package Array_Weekly_Test_4_6_March;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		int[]a= {4,6,5,-10,8,5,20};
		int input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input Faizz..............");
		input = sc.nextInt();
		
		for(int i = 0 ; i <a.length ; i++)
		{
			for(int j = i+1 ; j<a.length;j++)
			{
				if(input == a[i]+a[j])
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
