
public class AdamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 12;
		int n = num;
		
		int sq = num * num;
		int s = sq;
		int revNum=0;
		int revSq =0;
		
		
		while(n > 0)
		{
			int r = n % 10;
			revNum = (10*revNum) + r ;
			
			n = n/ 10;
		}
		System.out.println(revNum);
		int sqr = revNum * revNum;
		System.out.println(sqr);
		while(s > 0)
		{
			int r = s % 10;
			revSq = (10* revSq) + r;
			s = s/10;
		}
		
		System.out.println(revSq);
	
	if(revSq == sqr)
	{
		System.out.println("Adam Number");
	}else
	{
		System.out.println("Not an adom number");
	}
	
	}

}
