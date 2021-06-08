package Array7;

public class MeargeArrayN {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 }; 
		int b[] = { 4, 5, 6, 7, 8 }; 
		int a1 = a.length; // we have lenght of a in a1 = 3 
		int b1 = b.length; // we have lenght of b in b1 = 5
		int c1 = a1 + b1;  // c1 = 8
		
		int[] c = new int[c1]; // we assign c1 to array c
		for (int i = 0; i < a1; i = i + 1) 
		{ 
			c[i] = a[i]; // we are copying element first c[i]==0
			//c[0] madhe a[0] gela
			// c[0]=1;
			//so on c[i]== 1,2,3
		} 
		//now 
		for (int i = 0; i < b1; i = i + 1) 
		{ 
			c[a1 + i] = b[i]; 
		} 
		for (int i = 0; i < c1; i = i + 1) 
		{ 
			System.out.println(c[i]); 
		}
		
		
		
	}

}
