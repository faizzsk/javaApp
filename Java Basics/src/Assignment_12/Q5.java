package Assignment_12;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();

		al.add("sun");
		al.add("mon");
		al.add("tue");
		al.add("sun");
		al.add("mon");
		
		
		
		for(int i = 0 ; i < al.size();i++)
		{
			int j=0;
			for(j = 0 ; j <al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					break;
				}
			}
			if(j==i)
			{
				al.remove(i);
				i--;
			}
		}
		
		System.out.println(al);
		
	}

}
