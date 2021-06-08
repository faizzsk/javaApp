package Array7;

public class Actor {
	
	
	
	
	int id;
	String name;
	char gender;
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actor(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	

}
