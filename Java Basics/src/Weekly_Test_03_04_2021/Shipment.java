package Weekly_Test_03_04_2021;

public class Shipment {
	
	int shipId;
	String Cust_name;
	Address addr; 
	MyDate shipDate;
	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shipment(int shipId, String cust_name, Address addr, MyDate shipDate) {
		super();
		this.shipId = shipId;
		Cust_name = cust_name;
		this.addr = addr;
		this.shipDate = shipDate;
	}
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getCust_name() {
		return Cust_name;
	}
	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public MyDate getShipDate() {
		return shipDate;
	}
	public void setShipDate(MyDate shipDate) {
		this.shipDate = shipDate;
	}
	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", Cust_name=" + Cust_name + ", addr=" + addr + ", shipDate=" + shipDate
				+ "]";
	}

	
	
	
	

}
