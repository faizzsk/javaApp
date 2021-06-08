package Assignment_11;
enum Level{
	top {
		@Override
		void showLevel() {
			System.out.println("This is Top");
		}
	},middle {
		@Override
		void showLevel() {

			System.out.println("This is Middle");
		}
	},last {
		@Override
		void showLevel() {
			System.out.println("this is last");
			
		}
	};
	abstract void showLevel();
}

public class Q10  {

	public static void main(String[] args) {

		
		Level top = Level.top;
		top.showLevel();
		
		Level middle = Level.middle;
		middle.showLevel();
		
		Level last = Level.last;
		last.showLevel();
	}
	
	
}
