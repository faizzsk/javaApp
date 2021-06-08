package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

	int id;
	String Cust_name;
	ArrayList<Item> item;
	
	
	public Order(int id, String cust_name, ArrayList<Item> item) {
		super();
		this.id = id;
		Cust_name = cust_name;
		this.item = item;
	}


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCust_name() {
		return Cust_name;
	}


	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}


	public ArrayList<Item> getItem() {
		return item;
	}


	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", Cust_name=" + Cust_name + ", item=" + item + "]";
	}


	public static void main(String[] args) {

		ArrayList<Order> list = new ArrayList<Order>();
		ArrayList<Item> itm = new ArrayList<Item>();
		
		Order ord[] = new Order[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i  = 0 ; i < ord.length ; i++)
		{
			System.out.println("order id,cust name,");
			ord[i] = new Order();
			ord[i].setId(sc.nextInt());
			ord[i].setCust_name(sc.next());
			for(int j = 0 ; j < 3 ; j++) {// hard coded 3
				System.out.println("enter Fruit name, quanity");
				itm.add(new Item(sc.next(), sc.nextInt()));
			}
			ord[i].setItem(itm);
			
	
			list.add(ord[i]);
		}
		
		
		
		
		
		
		System.out.println(list);
	
		for(Order o : list) // only mango count
		{		
			int qaty=0;

			String name = o.getCust_name();
			for(Item i:itm)
			{
				if(i.getName().equalsIgnoreCase("mango") && o.getCust_name().equalsIgnoreCase(name) )
				{
					qaty = qaty + i.getQty();
				}
			}

			System.out.println(" "+qaty);

		}
		
				
		String name = "";
		
		for(int i= 0 ; i < itm.size(); i++)
		{
			int qty=0;
			int cnt=0;
			String ffname = itm.get(i).getName();
			if(!name.equalsIgnoreCase(ffname))
			{
				for(int j = 0 ; j < itm.size(); j++)
				{
					if(itm.get(j).getName().equalsIgnoreCase(ffname))
					{
						qty = qty + itm.get(j).getQty();
						cnt++;
					}
				}
			}
			
			if(cnt >0)
			{
				name = ffname;
			}
			
			System.out.println(itm.get(i).getName()+"    "+qty);
		}
		

	}

}
