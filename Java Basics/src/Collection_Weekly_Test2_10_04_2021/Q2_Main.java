package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Q2_Main {

	public static void main(String[] args) {

		ArrayList<Menu> listMenu= new ArrayList<Menu>();
		ArrayList<MenuItem> menuitem= new ArrayList<MenuItem>();

		ArrayList<Order> listOrder = new ArrayList<Order>();
		
		Scanner sc = new Scanner(System.in);
		
		menuitem.add(new MenuItem(1, "wadapaw", 10));
		menuitem.add(new MenuItem(2, "wadasambar", 50));
		menuitem.add(new MenuItem(3, "aq", 10));
		menuitem.add(new MenuItem(4, "ABC", 50));
		
		listMenu.add(new Menu(1, "BreakFast", menuitem));
		listMenu.add(new Menu(2, "lunch", menuitem));
		listMenu.add(new Menu(3, "lunch", menuitem));
		listMenu.add(new Menu(4, "Dinner", menuitem));

		listOrder.add(new Order(1, 1, 1, "Faiz"));
		listOrder.add(new Order(1, 1, 1, "Faiz"));
		listOrder.add(new Order(1, 1, 1, "Faiz"));
		listOrder.add(new Order(2, 1, 1, "Nikita"));
		listOrder.add(new Order(3, 1, 1, "XCV"));
		listOrder.add(new Order(3, 1, 2, "XCV"));
		listOrder.add(new Order(3, 1, 2, "XCV"));

		
		int cnt=0;
		for(Order o:listOrder)
		{
			for(Menu m :listMenu)
			{
				if(m.getMenu_id()==2 && o.getMenuItem_id()==2 )
				{
					cnt++; 
				}
			}
		
		}
		
		System.out.println(cnt);
		
		
	}
	

}
