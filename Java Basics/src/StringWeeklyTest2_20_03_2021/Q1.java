package StringWeeklyTest2_20_03_2021;

public class Q1 {

	
	public static boolean rotation(String s,String t)
	{
		String k =s+s;
		
		
		if(k.contains(t)==true) {
			return true;
		}else
		
		return false;
	}
	
	public static void main(String[] args) {

		System.out.println(rotation("XYZ","YXZ"));
		
		String str1="xyz";
		String str2= str1+str1;
		
		
		String str3="yxz";
		
		System.out.println(str2.contains(str3));
		
		
	}

}
