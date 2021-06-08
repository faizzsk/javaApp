package Array7;

import java.util.Arrays;

public class Order {
	
	int orderid;
	String orderdate;
	Item[] itemList;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, String orderdate, Item[] itemList) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.itemList = itemList;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public Item[] getItemList() {
		return itemList;
	}

	public void setItemList(Item[] itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderdate=" + orderdate + ", itemList=" + Arrays.toString(itemList)
				+ "]";
	}
	
	
	
	

}	
	
