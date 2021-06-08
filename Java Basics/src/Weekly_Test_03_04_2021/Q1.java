package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		al.add("Mon");
		al.add("Sun");
		 al.add("Sun");
       //  al.add("Mon");
         al.add("Sat");
         al.add("Sun");
        // al.add("Mon");
         al.add("Sat");
         al.add("Sun");
       
      for(int i = 0 ; i < al.size();i++)
		{
			int j;
			for(j = i+1 ; j <al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.remove(j);
				//	j--;
					i--;
					//break;
					break;
				}
			}
//			if(i==j)
//			{
//				al.remove(j);
//				//i--;
//				//al.remove(j);
//			}
//		
		}
		System.out.println(al);
         
         Iterator<String> q = al.iterator();
         
//        
//         while(q.hasNext())
//         {
//        	 q.remove();
//         }
//		         System.out.println(al);

	}

}
