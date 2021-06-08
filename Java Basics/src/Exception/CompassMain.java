package Exception;

import java.util.Arrays;
import java.util.Scanner;

public class CompassMain {

	public static void main(String[] args) {

		Compass [] c = new Compass[2];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < c.length ; i++) {
			
			
			c[i]= new Compass();
			c[i].setCid(sc.nextInt());
			c[i].setBrandname(sc.next());
			Pencil [] p = new Pencil[2];

			for(int j = 0 ; j < p.length ; j++) {
				p[j]=new Pencil();
				p[j].setId(sc.nextInt());
				p[j].setName(sc.next());
				
				
			}
			
			c[i].setPencil(p);
			
			Rubber r = new Rubber();
			r.setRid(sc.nextInt());
			r.setBrandName(sc.next());
			c[i].setRubber(r);
		}
		
		
		System.out.println(Arrays.toString(c));
		
		
	}

}
