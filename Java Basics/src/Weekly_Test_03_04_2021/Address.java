package Weekly_Test_03_04_2021;

public class Address {
	String addr;
	String City;
	String State;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		City = city;
		State = state;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [addr=" + addr + ", City=" + City + ", State=" + State + "]";
	}
	
	
	
	
	
	
	
	

}
