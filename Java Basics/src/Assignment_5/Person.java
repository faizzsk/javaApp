package Assignment_5;

public class Person {

	
	private int id;
	private String name;
	private Job job;
	
	public Person() {
	
	}

	
	
	public Person(int id, String name, Job job) {

		this.id = id;
		this.name = name;
		this.job = job;
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

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	
	
}
