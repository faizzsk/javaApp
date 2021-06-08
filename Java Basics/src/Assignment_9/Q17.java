package Assignment_9;

public class Q17 {

	public static void main(String[] args) {
	
	String s = "This is an umbrella";
	String[] arr = s.split(" "); // it returns me string s array
	int mx=0;
	int mn=0;
	String l="",sm="";
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].length()>mx)
		{
			mx = arr[i].length();
			l=arr[i];
			
		}else
		{
			mn = arr[i].length();
			sm = arr[i];
		}
		System.out.println(arr[i]);
	}
	System.out.println(mx+" "+l);
	System.out.println(mn+" "+sm);
}
}
