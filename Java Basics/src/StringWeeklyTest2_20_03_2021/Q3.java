package StringWeeklyTest2_20_03_2021;

public class Q3 {

	public static void main(String[] args) {

		String str="aabbccddeffghi";
		char ch[]=str.toCharArray();
		for(int i = 0; i < ch.length ; i++)
		{
			int cnt=0;
			int flag=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;

				}			
			}
			if(cnt==1)
			{
				System.out.println("First Non Repeating char:"+ch[i]);
				break;
			}
		}
		
		
	}

}
