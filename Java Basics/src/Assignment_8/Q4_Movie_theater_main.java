package Assignment_8;

import java.util.Scanner;

public class Q4_Movie_theater_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		Theatre t[] = new Theatre[1];
		
		
		Movie m [] = new Movie[3];

		
		for(int i = 0 ; i < t.length ; i++)
		{
			
			System.out.println("Enter thtre id , name location");
			t[i] = new Theatre();
			t[i].setTid(sc.nextInt());
			t[i].setName(sc.next());
			t[i].setLocation(sc.next());

			for(int j =0 ; j<m.length;j++)
			{
			m[j] = new Movie();
			System.out.println("Enter movie id---movie name----movie rating");
			m[j].setMid(sc.nextInt());
			m[j].setMname(sc.next());
			m[j].setRating(sc.nextInt());
		
		}
			
			t[i].setMovie(m);
		
		}
		
		
		
		
		for(int i = 0 ; i<m.length ; i++)
		{
			
			for(int j = i+1 ; j < m.length;j++)
				
			{
					if(m[i].getRating() < m[j].getRating())
					{
						Movie temp = m[i];
						m[i] = m[j];
						m[j] = temp;
					}
			
			}
			System.out.println(m[i]);

			
		}
		
		//System.out.println();
		
	/*	for(int i = 0 ; i < t.length ; i++)
		{
			for(int j = 0 ; j < m.length-1 ; j++)
			{
				
				System.out.print(" "+t[i]);
			}
		}
		
		*/
		
		
	}

}
