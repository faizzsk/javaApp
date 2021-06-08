package HW19_2_2020;

public class Item {
	
	
	int itemID;
	private String itemName;
	private Double itemPrice;
	
	
	public Item() {
		
	}


	public Item(int itemID, String itemName, Double itemPrice) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}


	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	

}
