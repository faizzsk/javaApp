package Exception;

import java.util.Arrays;

public class Book {
	
	int bookId;
	String bookName;
	int pages;
	Author author;
	
	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(int bookId, String bookName, int pages, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.pages = pages;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", pages=" + pages + ", author=" + author + "]";
	}


	

	
	
	
	
}
