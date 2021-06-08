package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {

		System.out.println("------ArrayList To Array-----");
		ArrayList<Integer> al = new ArrayList<Integer>();
			
			al.add(12);
			al.add(14);
			al.add(24);
		
			int b[] = {1,29,3,4,5,6,7,7,4};

			
			
			
			Object[] obj= al.toArray();//1
			
			for(Object p :obj ) {
				System.out.println(p);
			}
			
			Integer[] arr = new Integer[al.size()];//2
	        arr = al.toArray(arr);
	  
	        for (Integer x : arr)
	            System.out.println(x);

	        int [] array = new int[al.size()];//3
	    	
	    	for(int i = 0 ; i <al.size();i++ )
	    	{
	    		array[i] = al.get(i);
	    	}
	    	System.out.println(Arrays.toString(array));

	    	System.out.println("---------Array To Arralist--------");
	    
		
	    	Integer[] ab = {1,92,3,4,5,5};
	    	
	    	ArrayList<Integer> n = new ArrayList<Integer>();//1
	    	
	    	for(int i = 0 ; i < ab.length;i++)
	    	{
	    		n.add(ab[i]);
	    	}
	    	System.out.println(n);
	    	
	    	System.out.println("----------");
	    	
	    	List<Integer>l2 = new ArrayList<>();  //2
	        l2 =  Arrays.asList(ab);  
	        System.out.println(l2);
	        
	        System.out.println("----------------");
	        
	        
	        
	        String str[] = {"Faiz","What","is","this"};
	        
	        ArrayList<String> list = new ArrayList<String>();
	       
	        Collections.addAll(list,str);
	        
	        System.out.println(list);
	        
	        

	}

}
