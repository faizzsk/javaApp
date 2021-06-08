package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;

public class Q3 {

	
	public static void main(String[] args) {
		
		ArrayList<Book> bk = new ArrayList<Book>();
		
		ArrayList<Author> at = new ArrayList<Author>();
		
		Author a = new Author(1, "Faiz", 10);
		Author b = new Author(2, "APJ Abdul Kalam", 5);
		Author c = new Author(3, "PL Deshpande", 4);
		Author d = new Author(4, "ABC", 2);
		Author e = new Author(5, "CDE", 1);
		Author f = new Author(6, "FGH", 0);

		at.add(a);
		at.add(b);
		at.add(c);
		at.add(d);
		at.add(e);
		at.add(f);

		bk.add(new Book(1, "Life",a.getAuthorid() , 100, 5));
		bk.add(new Book(1, "Life",b.getAuthorid() , 500, 5));
		bk.add(new Book(1, "Life",d.getAuthorid() , 400, 5));
		bk.add(new Book(1, "Life",a.getAuthorid() , 800, 4));
		bk.add(new Book(1, "Life",c.getAuthorid() , 900, 5));
		bk.add(new Book(1, "Life",b.getAuthorid() , 100, 88));

	//	int total=0;
		
//	for(Book bo:bk)
//	{
//		int total=0;
//		int aid = bo.getAuthorid();
//		for(Author ao: at)
//		{
//			int bid = ao.getAuthorid();
//			
//			if(aid==bid)
//			{
//				total = bid + aid; 
//			}
//		}
//		
//	}
//	
//	for(int i = 0 ; i < bk.size() ; i++)
//	{
//		int total=0;
//		int bid =bk.get(i).getAuthorid();
//		int j=0;
//		for( j = 0 ; j < at.size();j++)
//		{
//			if(bid == at.get(j).getAuthorid())
//			{
//				total = bk.get(i).getCopiessold() + at.get(j).getTotalbookssold();
//			}
//
//			at.get(i).setTotalbookssold(total);
//
//		}
//	}
//		int total=0;
//
//		for(int i = 0 ; i < bk.size() ; i++)
//		{
//			int bid =bk.get(i).getAuthorid();
//			
//				if(bid == at.get(i).getAuthorid())
//				{
//					total = bk.get(i).getCopiessold() + at.get(i).getTotalbookssold();
//				}
//
//				at.get(i).setTotalbookssold(total);
//
//			
//		}
		
		
		for(int i = 0 ; i < at.size() ; i++)
		{
			int total=0;

				int aid =at.get(i).getAuthorid();
				int j=0;
				for( j = 0 ; j < bk.size();j++)
				{
					if(aid == bk.get(j).getAuthorid())
					{
						total = total+bk.get(j).getCopiessold() ;
					}


				}
				at.get(i).setTotalbookssold(total+at.get(i).getTotalbookssold());

			}


		
//		if(bk.get(0).getAuthorid()==at.get(0).getAuthorid())
//		{
//			
//			total = at.get(0).getTotalbookssold() + bk.get(0).getCopiessold();
//			
//			at.get(0).setTotalbookssold(total);
//			System.out.println(total);
//	
//		}
//		
	System.out.println(at);
	System.out.println(bk);
//		
		
		
		
	}
	
	
	
}
