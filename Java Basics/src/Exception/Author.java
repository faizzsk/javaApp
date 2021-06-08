package Exception;

public class Author {
	
	int authorId;
	String name;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String name) {
		super();
		this.authorId = authorId;
		this.name = name;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + "]";
	}
	
	

}
