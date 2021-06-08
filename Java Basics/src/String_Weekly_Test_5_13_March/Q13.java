package String_Weekly_Test_5_13_March;

import java.util.Arrays;

public class Q13 {

	public static String duplicateRemove(char a[], int n)
	{
		
		
		int index=0;
		
		
		for(int i = 0 ; i<a.length;i++)
		{
			int j ;
			for(j = 0 ; j < i ; j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			if(j==i)
			{
				a[index]=a[i];
				index++;
			}
			
		}
	//	s = str.toString();
        return String.valueOf(Arrays.copyOf(a, index)); 
		//return str.toString();
	}
	
	
	
	
	public static void main(String[] args) {
	
		String s = "thin sticks";
		char[]str=s.toCharArray();
		String s2 = new String("thick bricks");
		char[]str2= s2.toCharArray();
		
		int n = str.length;
		int n2=str2.length;
		String str1 = duplicateRemove(str, n);
		String str3 = duplicateRemove(str2,n2);
		
		
		
		char[] finall = str1.toCharArray();
		char[] finskl2 = str3.toCharArray();
		//c h i k s t;
		System.out.println(Arrays.toString(finall));
		System.out.println(Arrays.toString(finskl2));
		
		char[] mearge = new char[finall.length+finskl2.length];
		
		for(int i = 0 ; i < finall.length;i++)
		{
			mearge[i]=finall[i];
		}
		for(int i = 0 ; i < finskl2.length;i++)
		{
			mearge[finall.length+i]=finskl2[i];
		}
		
		int k = 0;
		System.out.println("Mearge  "+Arrays.toString(mearge));
	//	String str88 = mearge.toString();

		char[] ot = new char[10];
		for(int i = 0 ; i < mearge.length;i++)
		{
			for(int j = i+1 ; j < mearge.length;j++)
			{	
			if(mearge[i]==mearge[j])
			{
				ot[k++]= mearge[i];
			}
			}
		}
		System.out.println(""+Arrays.toString(ot));
		
		Arrays.sort(ot);
		
		
		String faiz = ot.toString();
		
		
		
		
		System.out.println("rwr..."+Arrays.toString(ot));
		
//		
//		for(int i = 0 ; i < finall.length;i++)
//		{
//			for(int j = 0 ; j <finskl2.length;j++)
//			{
//				if(finall[i]!=finskl2[j])
//				{
//					break;
//
//				}
//				else if(finall[i]==finskl2[j])
//				{
//					//output[index++]=finall[i];
//					//break;
//				}
//			}
//			//
//				output[index++] = finskl2[i];
//			//output[index++] = finskl2[i];
//
//			//index++;
//		}
//		
//			System.out.println(output.length);
//		
//		//Arrays.sort(output);
//		System.out.println("Hope it will run"+Arrays.toString(output));
//
//		//System.out.println();
//		//System.out.println(str1);
//	//	System.out.println(duplicateRemove(str,n));
//		
	
	
	}
}
