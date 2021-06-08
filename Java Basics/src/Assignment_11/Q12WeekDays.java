package Assignment_11;
public class Q12WeekDays { 
	public enum Days { 
		
		MON, TUE, WED, THU, FRI, SAT 
	
	}; 

	public static void main(String[] args) { 
		
		for (Days d : Days.values()); 
		Days[] d2 = Days.values(); 
		System.out.println(d2[2]); 
	} 
}
