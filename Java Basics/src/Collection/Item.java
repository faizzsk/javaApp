package Collection;

public class Item {

	String name;
	int qty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item ["+" name=" + name + ", qty=" + qty + "]";
	}
	
	
}
