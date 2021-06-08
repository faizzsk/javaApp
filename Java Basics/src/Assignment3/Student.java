package Assignment3;

public class Student {

	
	
		int id=8;
		
		
		int getId()
		{
			return id;
		}
		
		
		public void displayData()
		{
				getId();
				System.out.println(getId());
		}
	
	public static void main(String[] args) {

		
		Student s = new Student();
		Student s1 = new Student();
		
	//	System.out.println(s1.id);
		
		s1.id=34;
		s=s1;
	//	System.out.println(s1.id);
		s.getId();
		s.displayData();
		s1.getId();
		s1.displayData();
	}

}
//Q 1 to 5