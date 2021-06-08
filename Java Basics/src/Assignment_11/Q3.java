package Assignment_11;

enum Days
{
	sun,mon,tue,wed,thrus,fri,sat;
}

public class Q3 {

	public static void main(String[] args) {

		Days [] d=Days.values();
		
		for(int i =0 ; i <d.length;i++) {
			
			System.out.println("Index:"+i+" Day :"+d[i]);
			System.out.println(d[i] + " at index "
                    + d[i].ordinal());//it gives index just like array;
			
		}
		
		
	}

}
