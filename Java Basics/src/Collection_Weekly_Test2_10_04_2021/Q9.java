package Collection_Weekly_Test2_10_04_2021;

public class Q9 {

	public static void main(String[] args) {

		
		int [] a = {1,4,3,92,4,4,5,7,29,0,29};
		int increasing=0;
		int bouncy = 0;
		int decreasing =0;
		
		
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			if(a[i]<a[i+1])
			{
				increasing++;
				System.out.println("in "+a[i]+"  "+a[i+1]);
			}
			else if(a[i]>a[i+1])
			{
				decreasing++;
				System.out.println("d"+a[i]+"  "+a[i+1]);

			}
			else
			{
				bouncy++;
			}
		}
		
		System.out.println("I"+increasing);
		System.out.println("D"+decreasing);
		System.out.println("B"+bouncy);


	}

}
