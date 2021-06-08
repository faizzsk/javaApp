package Assignment4;

public class Q13 {

		public void print(int n , char c)
		{
			System.out.println(n+" "+c);
		}
	
		public void print(char c , int n)
		{
			System.out.println(c+" "+n);
		}
	
	
	
	
	
	
	public static void main(String[] args) {
			Q13 q = new Q13();
			q.print('F', 10);
			q.print(10, 'F');
	}

}
