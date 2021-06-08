package Day_3_OOPs;

public class Address {
	
	private int pinCode;
	private String city;
	private String address;
	
	public Address(int pinCode, String city, String address) {
		
		this.pinCode = pinCode;
		this.city = city;
		this.address = address;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address() {
		
		
	pinCode=0;
	city = " ";
	address = "";
	
	
	}
	
	
	

}
