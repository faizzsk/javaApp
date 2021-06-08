package HW19_2_2020;

public class DeleveryBoy {
	

	private String name;
	private long mobileNo;
	public DeleveryBoy() {
		
	}
	
	public DeleveryBoy(String name, long mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
