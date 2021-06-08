package Assignment_13;

public class Emp implements Comparable<Emp> {
	
	int id;
	String name;
	int sal;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emp o) 
	{
		
		if(this.getSal()==o.getSal())
		{
			if(this.getName().equalsIgnoreCase(o.getName()))
			{
				return this.getId()-o.getId();
			}
			else
			{
				return this.getName().compareTo(o.getName());
			}
		}else
		{
			return o.getSal() - this.getSal();
		}
		
		
		
	}
	
	// Q12

}
