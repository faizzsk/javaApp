package HW19_2_2020;

public class Order {

	
	private int orderid;
	private String date;
	Item item;
	DeleveryBoy boy;
	
	
	public Order() {
		
	}


	public Order(int orderid, String date, Item item, DeleveryBoy boy) {

		this.orderid = orderid;
		this.date = date;
		this.item = item;
		this.boy = boy;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	

	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public DeleveryBoy getBoy() {
		return boy;
	}


	public void setBoy(DeleveryBoy boy) {
		this.boy = boy;
	}
	
	
	public void display()
	{
		System.out.println("----Bill Details-------");
		System.out.println("Order Id :"+orderid);
		System.out.println("Date :"+date);
		System.out.println("Item Id :"+item.getItemID());
		System.out.println("Item Name :"+item.getItemName());
		System.out.println("Item Price :"+item.getItemPrice());
		System.out.println(" Delivery Boy : Name :"+boy.getName());
		System.out.println("Delivery Boy : Mobile No."+boy.getMobileNo());
		System.out.println("-----------Thank You-----------------");
	}
	
	
	
	
	
	
}
