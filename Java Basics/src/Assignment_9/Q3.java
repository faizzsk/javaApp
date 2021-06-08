package Assignment_9;

public class Q3 {

	public static void main(String[] args) {

		
		String s = "Hey this is 123 ";
		int v=0;
		int d=0;
		int sp=0;
		int cns=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O'||ch=='U'
				|| ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u')
			{
				v++;
			}
			else if(ch =='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'
					||ch =='6'||ch=='7'||ch=='8'||ch=='9')
			{
				d++;
			}
			else if(ch==' ')
			{
				sp++;
			}
			else
			{
				cns++;
			}
		}
	
		System.out.println("Vowelss:"+v+" "+"Consonent:"+cns+" Digit:"+d+" Space:"+sp);
	}
	
	

}
