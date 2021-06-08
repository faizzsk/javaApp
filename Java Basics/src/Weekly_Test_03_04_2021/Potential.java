package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class Potential {

	public static void main(String[] args) {

		String str = "the sky is the limit";
		str = str.toUpperCase();
		String strArr[] = str.split(" ");
		
		int [] Narr 	=  new int[strArr.length];
		String[] wArr	= new String[strArr.length];

		for(int i = 0 ; i < strArr.length;i++)
		{	
			int num=0;

			String k = strArr[i];

			for(int j = 0 ; j < k.length() ; j++)
			{
				char ch = k.charAt(j);

				num = num + (ch-64);
			}
			Narr[i]=num;
			wArr[i]=k;
		

		}



		for (int i = 0; i < wArr.length-1; i++) {

			for (int j = 0; j < wArr.length - i - 1; j++) 
			{

				if (Narr[j] > Narr[j+1]) 
				{
					int t = Narr[j];
					Narr[j] = Narr[j+1];
					Narr[j+1] = t;

					String temp = wArr[j];
					wArr[j] = wArr[j+1];
					wArr[j+1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(Narr));
		System.out.println(Arrays.toString(wArr));










	}

}
