package Hw_11_feb;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {

		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int a = num;
		
		int sq = num * num;
		int cnt=0;
	
		
		while(num > 0)
		{
			num = num / 10 ;
			cnt++;
		}
		
	//	System.out.println(cnt);
		double d = Math.pow(10, cnt);
	//	System.out.println(d+"raise to");
		
		double ans = sq % d;
		System.out.println(ans +" "+a);
		if(ans == a)
		{
			System.out.println("Yes it is Automorphicc");
		}else
			
		{
			System.out.println("no it is not");
		}
		
	}

}
