package String_Weekly_Test_5_13_March;

import java.util.Arrays;

public class Q13_test {
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
		
		s = duplicateRemove(str, n);
		s2 = duplicateRemove(str2,n2);
		
		
		
		char[] finall = s.toCharArray();
		char[] finskl2 = s2.toCharArray();
		//c h i k s t;
	//	System.out.println(Arrays.toString(finall));
		//System.out.println(Arrays.toString(finskl2));
		
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
//		System.out.println("Mearge  "+Arrays.toString(mearge));
	//	String str88 = mearge.toString();

		char[] ot = new char[finall.length];
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
		//System.out.println(""+Arrays.toString(ot));
		
		Arrays.sort(ot);
			
		
		
		
		System.out.println("rwr..."+Arrays.toString(ot));

		
	}

}
