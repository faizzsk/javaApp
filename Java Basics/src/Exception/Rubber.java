package Exception;

public class Rubber {
	
	int rid;
	String BrandName;
	public Rubber(int rid, String brandName) {
		super();
		this.rid = rid;
		BrandName = brandName;
	}
	public Rubber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	@Override
	public String toString() {
		return "Rubber [rid=" + rid + ", BrandName=" + BrandName + "]";
	}
	
	

}
