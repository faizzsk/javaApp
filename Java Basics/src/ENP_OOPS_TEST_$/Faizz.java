package ENP_OOPS_TEST_$;

public class Faizz {
	int x;
 	double y;
        void add(int a , int b) {
            x = a + b;
        }
        void add(double c , double d){
            y = c + d;
        }
       void overload(int a,int b) {
            this.x = a;
            this.y = b;
       }
	
	
	public static void main(String[] args) {
		
		Faizz obj = new Faizz();   
        int a = 2;
        double b = 3.2;
        obj.add(a, a);
        obj.add(b, b);
        System.out.println(obj.x + " " + obj.y);     
    

		
	}
	
	
	
}
	 /*
        static int x=2;
         int y;
        void add(int a){
            x =  a + 1;
        }
        void add(int a , int b){
	add(a);
            x +=  a + 2;
        }        
    

   
        public static void main(String args[])
        {
        	System.out.println(" iguiyg ");
        	Faizz obj = new Faizz();   
            int a = 0;
            obj.add(6, 7);
            System.out.println(obj.x);     
        }
   }
*/
	
	

	

