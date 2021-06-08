package Exception;

public class Pencil {

	int id;
	String name;
	public Pencil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pencil(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Pencil [id=" + id + ", name=" + name + "]";
	}
	
	
}
