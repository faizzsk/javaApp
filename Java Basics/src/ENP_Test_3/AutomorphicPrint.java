package ENP_Test_3;

public class AutomorphicPrint {

	public static void main(String[] args) {

		
		
		for ( int i = 1 ; i <= 1000 ; i++)
		{
			int num = i ;
			int O_num = num;
			int sq = num * num ;
			
			int cnt=0;
			while(num > 0)
			{
				cnt++;
				num=num/10;
			}
			
			int r = (int) (sq % (Math.pow(10, cnt)));
			
			if(r==O_num)
			{
				System.out.println(" "+O_num);
			}
			
		}
		
		
		
		
	}

}
