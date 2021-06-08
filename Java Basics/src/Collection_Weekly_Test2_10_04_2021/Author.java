package Collection_Weekly_Test2_10_04_2021;

import java.util.List;

public class Author {
	int authorid ;
	String authorname ;
	int totalbookssold ;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorid, String authorname, int totalbookssold) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
		this.totalbookssold = totalbookssold;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getTotalbookssold() {
		return totalbookssold;
	}
	public void setTotalbookssold(int totalbookssold) {
		this.totalbookssold = totalbookssold;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + ", totalbookssold=" + totalbookssold
				+ "]";
	}
	
	
	
}




