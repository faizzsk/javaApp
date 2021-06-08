package Exception;

import java.util.Arrays;
import java.util.Scanner;

public class BookAuthorMain {

	public static void main(String[] args) {

		Book b[]=new Book[2];
	//	Author a[]= new Author[1];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < b.length ; i++)
		{
			System.out.println("Enter Book id, name , pages,----");
			b[i] = new Book();
			b[i].setBookId(sc.nextInt());
			b[i].setBookName(sc.next());
			b[i].setPages(sc.nextInt());
				System.out.println("author id, author name");
			Author a = new Author();
			a.setAuthorId(sc.nextInt());
			a.setName(sc.next());
			b[i].setAuthor(a);
		}
		
		for(int i = 0 ; i <b.length ; i++) {
			
			  if(b[i].getAuthor().getName().equalsIgnoreCase("Kanetkar")) {
				  System.out.println(b[i]);
			  }
			
			
			
		}
		
		
	//	System.out.println(Arrays.toString(b));
		
		
		
		
		
	}

}
