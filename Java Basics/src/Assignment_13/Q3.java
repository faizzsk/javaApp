package Assignment_13;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class Customer implements Comparable<Customer>{
	int  custId;
	String custName;
	long Mobile;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, long mobile) {
		super();
		this.custId = custId;
		this.custName = custName;
		Mobile = mobile;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", Mobile=" + Mobile + "]";
	}
	@Override
//	public int compareTo(Customer o) { Q6
//		return this.getCustId()-o.getCustId();
//	}
	
	public int compareTo(Customer o) { 

		if(this.getCustName().equalsIgnoreCase(o.getCustName()))
		{
			return o.getCustId() - this.getCustId();
		}else
		{
			return this.getCustName().compareTo(o.getCustName());
		}
	}// Q11
	
	
	
}
public class Q3 {

	public static void main(String[] args) {

		LinkedList<Customer> ll = new LinkedList<Customer>();
		
		ll.add(new Customer(11,"Faiz", 9028925229l));
		ll.add(new Customer(3, "Rahul",147852369l));
		ll.add(new Customer(2, "Rahul", 9028925229l));
		ll.add(new Customer(4, "Sneha",147852369l));
		
		
		
		for(int i = 0 ; i < ll.size() ; i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		for(Customer c : ll)
		{
			System.out.println(c);
		}
		
		Iterator<Customer> itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Collections.sort(ll);
		System.out.println(ll);
	}

}
