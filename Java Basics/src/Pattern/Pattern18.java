package Pattern;

public class Pattern18 {

	public static void main(String[] args) {
		int s=0;
		int kcnt=7;
		char ch='A';
		char ch1='G';
		for(int i = 1 ; i<=7;i++)
		{
			for(int j = 7; j>=i ; j--)
			{
				System.out.print(ch);
				ch++;
			}
			
			for(int sp = 0 ; sp<s;sp++)
			{
				System.out.print(" ");
			}
			
			for(char k = ch1  ; k>='A';k--)
			{
				System.out.print(k);
				//ch1--;
				//kcnt--;
			}
			
			System.out.println();
			ch='A';
			ch1--;
			//ch1--;
			kcnt--;
			s=s+2;
			//s=0;
		}

	}

}

/*
ABCDEFGGFEDCBA
ABCDEF  FEDCBA
ABCDE    EDCBA
ABCD      DCBA
ABC        CBA
AB          BA
A            A
*/