package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class StockComparator implements Comparator<Shipment> {
	  
 
	public int compare(Shipment c, Shipment  c2) {
		if(c.getAddr().getCity().compareTo(c2.getAddr().getCity())==0)
		{
			if(c.getShipDate().getDd() > c2.getShipDate().getDd())
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
		}
		
		if(c.getAddr().getCity().compareTo(c2.getAddr().getCity())> 0)
		
		return 1;
		else
			return -1;
	}
}
public class Q8_Main {
/*
 * 
 * 8.	Create List<Shipment>in which sorting is done according cities and if two order have same cities than according to shipment date(Ascending)
Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate)
Address class (String addr, String City, String State)
MyDate class  (int dd,mm,yy

 * 
 * Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate)
Address class (String addr, String City, String State)
MyDate class  (int dd,mm,yy)	[2M]

 */
	
//	public int compareTo(Shipment ship)
//    {
//		
//        if (ship.getAddr().City.compareTo(ship.getAddr().City) > 0)
//        		
//        
//            return 1;
//        else
//            return -1;
//    }

	public static void main(String[] args) {
		
		ArrayList<Shipment> al = new ArrayList<Shipment>();
		
		Shipment sl[] = new Shipment[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < sl.length; i++) 
		{
			System.out.println("enter id , cus name, addr: add,city,sltate , date, dd mm yyyy");
			sl [i] = new Shipment();
			
			sl[i].setShipId(sc.nextInt());
			sl[i].setCust_name(sc.next());
			
			Address addr = new Address(sc.next(), sc.next(), sc.next());
			sl[i].setAddr(addr);
			MyDate m = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
			sl[i].setShipDate(m);
			al.add(sl[i]);
		}
		
		
		System.out.println(al);
		
		
		Collections.sort(al, new StockComparator());
		
//		for (int i = 0; i < al.size()-1; i++)
//		{
//			for(int j = 0 ; j < al.size()-1; j++) {
//			if(al.get(j).getAddr().getCity().compareTo(al.get(j+1).getAddr().getCity())>0)
//			{
//				Shipment temp1=al.get(j);
//				Shipment temp3 = al.get(j+1);
//				
//				Shipment temp = temp1;
//				temp1 = temp3;
//				temp3 = temp;
//				System.out.println(temp1);
//				System.out.println(temp3);
//			}
//			
//			}
//	}
		
		
		
		System.out.println(al);

		
		
		
		
		
		
		
	}

}
