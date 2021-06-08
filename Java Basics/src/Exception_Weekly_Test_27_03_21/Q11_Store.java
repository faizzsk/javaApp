package Exception_Weekly_Test_27_03_21;

 class ItemStockUnderFlow extends Exception{
	
	 
}


 class ItemStockOverFlow extends Exception{
	
	 
}

public class Q11_Store {

	
	static int noOfItemsAvlbl;
	static int maxLevel=20;
	static int minLevel=0;
	
	public static void addItem(int item) throws ItemStockOverFlow  {
		if(maxLevel<=noOfItemsAvlbl+item) {
		noOfItemsAvlbl+=item;
		}else {
			throw new ItemStockOverFlow(); 
		}
		
	}
	
	public static void removeItem(int item) throws ItemStockUnderFlow {
		
		if(minLevel>=noOfItemsAvlbl-item) {
			noOfItemsAvlbl-=item;

		}else {
			throw new ItemStockUnderFlow();

		}
	}
	
	public static  void checkStocks()
	{
		System.out.println("total number of items :"+noOfItemsAvlbl);
	}
	
	
	public static void main(String[] args) {

		try {
			addItem(10);
			addItem(8);
			addItem(1);
			addItem(1);
			
			
			
		} catch (ItemStockOverFlow e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			removeItem(5);
			removeItem(18 );

			removeItem(2);
		//	removeItem(18 );
		}catch (ItemStockUnderFlow e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
				
			checkStocks();
	
		
	}

}
