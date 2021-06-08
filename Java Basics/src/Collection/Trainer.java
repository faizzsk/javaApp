package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Trainer implements Comparable<Trainer> {

	int id;
	String name;
	int sal;
	
	
	
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Trainer(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	
	@Override
	public int compareTo(Trainer o) {
		
		if(this.name.compareTo(o.name)==0)//compare names are same
		{
			return this.name.compareToIgnoreCase(o.name);
		}
		else
		{
			//return (int) (this.marks-s.marks);
			return (int) (o.id-this.id);
			//return (s.id-this.id);
		}
//		
//		if(o.getSal() == this.getSal())
//		{
//			return this.getName().compareToIgnoreCase(o.getName());
//		}
//		else
//		return this.getSal()-o.getSal();
	}


	public static void main(String[] args) {

		
		ArrayList<Trainer> al = new ArrayList<Trainer>();
		
		
		al.add(new Trainer(1, "Faiz", 45000));
		al.add(new Trainer(2, "Rifa", 78000));
		al.add(new Trainer(3, "Faiz", 50000));
		al.add(new Trainer(4, "Rahul", 50000));
		al.add(new Trainer(4, "Sneha", 15000));
		al.add(new Trainer(5, "Nikita", 50000));

		
		
		//Collections.sort(al);
		System.out.println(al);
		
		//Collections.sort(al,new SortByID());
	//	Collections.sort(al,new SortByIDAndName());
        Comparator c = Collections.reverseOrder();

		Collections.sort(al,c);
		System.out.println(al);

		
		
		
		
		
	}




	
}
