package Array7;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Stack {

	
	static int top=-1;
	static int maxsize=5;
	static int a[] = new int[maxsize];
	
	public static void push(int data)
	{
		//int[]a=new int[maxsize];
		
		if(top != maxsize)
		{
						top++;
			a[top] = data;
		}
			
	}
	
	public static int pop()
	{
		top--;
	//	a[top]=a[top];
		return a[top];
	}
	
	
	
	public static void main(String[] args) {

		 //= new int[maxsize];
		push(4);
		push(5);
		push(5);
		pop();
		//push(a, 4);
		//pop(a);
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}

}
