package Array7;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		size=sc.nextInt();
		
		int [] a = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter number and position");
		
		int number=sc.nextInt();
		int index=sc.nextInt();
		
		
		if(index < a.length)
		{
			a[index]=number;
		}else
		{
		
			size++;
			a[size] = number;
			
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
