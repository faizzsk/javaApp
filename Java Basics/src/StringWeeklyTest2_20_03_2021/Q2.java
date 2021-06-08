package StringWeeklyTest2_20_03_2021;

public class Q2 {

	public static void main(String[] args) {

		String str= "if not you who will?";
		String rev="";
		String[] strArr = str.split(" ");
		
		for(int i = 0 ; i < strArr.length ; i++)
		{
			
			char [] ch = strArr[i].toCharArray();
			
			for(int j = ch.length-1 ; j >= 0 ; j--)
			{
				rev = rev +ch[j];
			}
			rev=rev+" ";
			
		}
		
		System.out.println(rev);
		
		
		
	}

}
