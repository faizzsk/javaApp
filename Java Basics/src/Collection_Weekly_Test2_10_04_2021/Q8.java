package Collection_Weekly_Test2_10_04_2021;

public class Q8 {

	public static void main(String[] args) {

		
		
		String str ="One method takes Integer wrapper class type as an argument and another method "
				+ "takes primitive long type as an argument. In the main method, we are calling this";
		
		String[] arr = str.split(" ");
		
		int linelimit = 50;
		int chartakes = 4;
		int spacestakes =2;
		int size=0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			String str1 = arr[i];
			
			if(size <= linelimit)
			{
				size = size +str1.length() * 4;
				size = size+spacestakes * 1;
				System.out.print (arr[i]+" ");
			}
			else
			{
				System.out.println(str1);
				size=0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0 ; i < str.length();i++)
//		{
//			if(size < linelimit)
//			{
//				
//				{
//					if(str.charAt(i)<='z' && str.charAt(i)>='a')
//					{
//						size = size + chartakes;
//					}
//					else if(str.charAt(i)==' ')
//					{
//						size = size + spacestakes;
//					}
//				}
//				System.out.print(str.charAt(i));
//			}
//			else
//			{
//				System.out.println();
//				size=0;
//			}
//			
			
			
			
			
			
			
		}
		
	}


