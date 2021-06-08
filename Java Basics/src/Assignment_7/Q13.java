package Assignment_7;

public class Q13 {
	
	static void sort(String []s, int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	 
	        // Insert s[j] at its correct position
	        int j = i - 1;
	        while (j >= 0 && temp.length() > s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	}

	public static void main(String[] args) {

		
		String s[]= {"hi","how","are","you","doing","faiz"};

		sort(s,s.length);
		
		for(int i = 0 ; i <s.length ; i++)
		{
			System.out.println(" "+s[i]);
		}
		
		
		
		
		
		
	}

}
