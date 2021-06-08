package Exception;

public class Compass {
	
		
	int cid;
	String brandname;
	
	Rubber rubber;
	Pencil[] pencil;
	public Compass(int cid, String brandname, Rubber rubber, Pencil[] pencil) {
		super();
		this.cid = cid;
		this.brandname = brandname;
		this.rubber = rubber;
		this.pencil = pencil;
	}
	public Compass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Rubber getRubber() {
		return rubber;
	}
	public void setRubber(Rubber rubber) {
		this.rubber = rubber;
	}
	public Pencil[] getPencil() {
		return pencil;
	}
	public void setPencil(Pencil[] pencil) {
		this.pencil = pencil;
	}
	@Override
	public String toString() {
		return "Compass [cid=" + cid + ", brandname=" + brandname + ", getCid()=" + getCid() + ", getBrandname()="
				+ getBrandname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
}
