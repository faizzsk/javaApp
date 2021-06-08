package Collection_Weekly_Test2_10_04_2021;

public class MenuItem {
	
	int MenuItem_id;
	String MenuItem;
	int Price;
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuItem(int menuItem_id, String menuItem, int price) {
		super();
		MenuItem_id = menuItem_id;
		MenuItem = menuItem;
		Price = price;
	}
	public int getMenuItem_id() {
		return MenuItem_id;
	}
	public void setMenuItem_id(int menuItem_id) {
		MenuItem_id = menuItem_id;
	}
	public String getMenuItem() {
		return MenuItem;
	}
	public void setMenuItem(String menuItem) {
		MenuItem = menuItem;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "MenuItem [MenuItem_id=" + MenuItem_id + ", MenuItem=" + MenuItem + ", Price=" + Price + "]";
	}
	
	

}
