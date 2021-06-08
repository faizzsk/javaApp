package Array7;

public class Item {
	
		int itemid;
		String itemname;
		int price;
		int qty;
		
		public Item() {
		
		}

		@Override
		public String toString() {
			return "Item [itemid=" + itemid + ", itemname=" + itemname + ", price=" + price + ", qty=" + qty + "]";
		}

		public Item(int itemid, String itemname, int price, int qty) {
			super();
			this.itemid = itemid;
			this.itemname = itemname;
			this.price = price;
			this.qty = qty;
		}

		public int getItemid() {
			return itemid;
		}

		public void setItemid(int itemid) {
			this.itemid = itemid;
		}

		public String getItemname() {
			return itemname;
		}

		public void setItemname(String itemname) {
			this.itemname = itemname;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
	}

