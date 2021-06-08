package Assignment_7;

public class Q14 {

	public static void main(String[] args) {

		
		int a[]= {0,0,6,4,0,0,1};
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1 ; j<a.length ;j++) {
				
				int temp=0;
				
				if(a[i]==0)
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		
			}
			System.out.print(" "+a[i]);
		}
		
		
		
		
		
		
	}

}
