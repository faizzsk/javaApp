package Array7;

import java.util.Scanner;

public class TestMovie 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Display Movie Details: ");
		Movie m[] = new Movie[3];
		for(int i=0;i<m.length;i++)
		{
			m[i] = new Movie();
			System.out.println("enter movie id");
			m[i].setMid(sc.nextInt());
			System.out.println("enter  movie name");
			m[i].setMname(sc.next());
			
			Actor [] a=new Actor[2];
			for(int j=0;j<a.length;j++)
			{
				a[j]=new Actor();
				System.out.println("enter actor id");
				a[j].setActorid(sc.nextInt());
				System.out.println("enter actor name");
				a[j].setActorname(sc.next());
				System.out.println("enter actor gender");
				a[j].setGen(sc.next().charAt(0));
				
			}
			m[i].setActorlist(a);
		}
		for(Movie obj:m)
		{
			System.out.println(obj);
		}

	}

}
