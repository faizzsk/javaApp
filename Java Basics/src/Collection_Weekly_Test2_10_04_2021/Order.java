package Collection_Weekly_Test2_10_04_2021;

public class Order {
	






	int oredr_id;
	int menu_id;
	int MenuItem_id;
	String custName;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	

	public Order(int oredr_id, int menu_id, int menuItem_id, String custName) {
		super();
		this.oredr_id = oredr_id;
		this.menu_id = menu_id;
		MenuItem_id = menuItem_id;
		this.custName = custName;
	}






	@Override
	public String toString() {
		return "Order [oredr_id=" + oredr_id + ", menu_id=" + menu_id + ", MenuItem_id=" + MenuItem_id + ", custName="
				+ custName + "]";
	}






	public int getOredr_id() {
		return oredr_id;
	}






	public void setOredr_id(int oredr_id) {
		this.oredr_id = oredr_id;
	}






	public int getMenu_id() {
		return menu_id;
	}






	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}






	public int getMenuItem_id() {
		return MenuItem_id;
	}






	public void setMenuItem_id(int menuItem_id) {
		MenuItem_id = menuItem_id;
	}






	public String getCustName() {
		return custName;
	}






	public void setCustName(String custName) {
		this.custName = custName;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
