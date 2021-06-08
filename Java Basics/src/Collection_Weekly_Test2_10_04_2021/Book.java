package Collection_Weekly_Test2_10_04_2021;

public class Book {
	
	
	int bookid ;
	String bookname ;
	int authorid ;
	int price ;
	int copiessold; 
	Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String bookname, int authorid, int price, int copiessold) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorid = authorid;
		this.price = price;
		this.copiessold = copiessold;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCopiessold() {
		return copiessold;
	}
	public void setCopiessold(int copiessold) {
		this.copiessold = copiessold;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorid=" + authorid + ", price=" + price
				+ ", copiessold=" + copiessold + ", author=" + author + "]";
	}
	
	
	
}
