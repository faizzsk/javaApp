package HW19_2_2020;

public class Actor {

	
	private String Name;
	private char gender;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String name, char gender) {

		Name = name;
		this.gender = gender;
		
	}

	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
