package Assignment_5;

public class Teenager extends Kid {
	
	public void readBook()
	{
		System.out.println("in teenager ReadBook");
	}
	
	public static void main(String[] args) {
		
		
		Kid k1,k2;
		k1 = new Bigkid();
		k2 = new Teenager();
		
		k1.readBook();
		k2.readBook();
	}

}
