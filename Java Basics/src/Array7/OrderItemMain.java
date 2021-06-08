package Array7;

import java.util.Scanner;

public class OrderItemMain {

	public static void main(String[] args) {

		
		Order [] o = new Order[2];
		
		Item [] itm= new Item[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i<o.length;i++)
		{
			System.out.println("Enter id,order id,");
			o[i]= new Order();
			o[i].setOrderid(sc.nextInt());
			o[i].setOrderdate(sc.next());
			
			for(int j = 0 ; j < itm.length;j++)
			{
				itm[j]=new Item();
				System.out.println("Enter id , enter item name ,price , qty");
				itm[j].setItemid(sc.nextInt());
				itm[j].setItemname(sc.next());
				itm[j].setPrice(sc.nextInt());
				itm[j].setQty(sc.nextInt());
			}
			o[i].setItemList(itm);
		}
		
			int totlqty=0;

			/*for(int i = 0 ; i <o.length ; i++)
			{
				
				totlqty = totlqty + itm[i].getQty();
				
				System.out.println(o[i]);
			}
			System.out.println(totlqty);

	*/
		
			
			
			for(int i = 0 ; i < o.length ; i++)
			{
				
				Item item[]=o[i].getItemList();
				
				for(Item itmm: item)
				{
					if(itmm.getItemname().equalsIgnoreCase("pen")) {
						totlqty = itmm.getQty();
					}
				}
			
				System.out.println("total pen for order+"+(i+1)+" count "+totlqty);
			}
			
			
	}

}
