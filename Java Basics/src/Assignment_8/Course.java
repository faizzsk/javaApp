package Assignment_8;

public class Course {

	String name;
	int fees;
	

	@Override
	public String toString() {
		return "Course [name=" + name + ", fees=" + fees + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
