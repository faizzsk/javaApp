package Array7;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		
		float f[] = new float[5];
		
		Scanner sc  = new Scanner(System.in);
		
		
		System.out.println("Enter "+f.length+" Numbers");
	
		
		for(int i = 0 ; i < f.length ; i++)
		{
			f[i]=sc.nextFloat();
		}
	
		for(int i = 0 ; i<f.length;i++)
		{
			System.out.println("Data :"+f[i]);
		}
	
	
	}

}
