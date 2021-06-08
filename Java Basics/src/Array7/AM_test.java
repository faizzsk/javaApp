package Array7;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class AM_test {

	public static void main(String[] args) {

		
		Movie [] m = new Movie[1];
		
		Actor [] a = new Actor[2];
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i <m.length;i++)
		{
			m[i]= new Movie();
			System.out.println("Enter movie id , movie name ");
			m[i].setId(sc.nextInt());
			m[i].setName(sc.next());
			
			for(int j = 0 ; j < a.length ; j++)
			{
				a[j] = new Actor();
				System.out.println("Enter Actor id actor name actor gender");
				a[j].setId(sc.nextInt());
				a[j].setName(sc.next());
				a[j].setGender(sc.next().charAt(0));
			}
			
			m[i].setA_list(a);
		}
		
		for(int i = 0 ; i < m.length ; i++)
		{
			System.out.println(m[i]);
		}
		
		for(int i = 0 ; i < m.length ; i++)
		{
			if(a[i].gender == 'm')
			{
				System.out.println("Male Actors are"+a[i]);
			}
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			
			if(a[i].gender == 'f')
			{
				System.out.println("Female Actors are : "+a[i]);
			}
		}
	
		System.out.println("Enter which actor's movies u want to search");
		String ch = sc.next();
	
		for(int i = 0 ; i <m.length;i++)
		{
			
			if(a[i].getName()==ch)
			{
			System.out.println("Actor Details : "+a[i]+ " "+m[i]);
			break;
			}
		}

		
		
	}

}
