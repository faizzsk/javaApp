package Assignment_5;

public class Stud_Dept {

	public static void main(String[] args) {

		
		
		Department d = new Department(4, "Science");
		Student s = new Student(2, "Faizz", d);
		
		System.out.println("Roll Number:"+s.getRn());
		System.out.println("Name :"+s.getName());
		
		System.out.println("DepartMent id :"+d.getId());
		System.out.println("Department Name :"+d.getDep_name());
		
		
		
		
	}

}
