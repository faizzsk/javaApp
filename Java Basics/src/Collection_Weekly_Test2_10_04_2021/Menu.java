package Collection_Weekly_Test2_10_04_2021;

import java.util.List;

public class Menu {

	 int Menu_id;
	 String Menu_name;
	 List<MenuItem> menuitm;
	 
	 
	 
	 
	 
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Menu(int menu_id, String menu_name, List<MenuItem> menuitm) {
		super();
		Menu_id = menu_id;
		Menu_name = menu_name;
		this.menuitm = menuitm;
	}

	
	



	public int getMenu_id() {
		return Menu_id;
	}





	public void setMenu_id(int menu_id) {
		Menu_id = menu_id;
	}





	public String getMenu_name() {
		return Menu_name;
	}





	public void setMenu_name(String menu_name) {
		Menu_name = menu_name;
	}





	public List<MenuItem> getMenuitm() {
		return menuitm;
	}





	public void setMenuitm(List<MenuItem> menuitm) {
		this.menuitm = menuitm;
	}





	@Override
	public String toString() {
		return "Menu [Menu_id=" + Menu_id + ", Menu_name=" + Menu_name + ", menuitm=" + menuitm + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
