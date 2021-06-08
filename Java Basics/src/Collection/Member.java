package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {

	
	
	String membername;
	String gender;//enum
	String profession;
	int age;
		
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Member(String membername, String gender, String profession, int age) {
		super();
		this.membername = membername;
		this.gender = gender;
		this.profession = profession;
		this.age = age;
	}



	public String getMembername() {
		return membername;
	}



	public void setMembername(String membername) {
		this.membername = membername;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Member [membername=" + membername + ", gender=" + gender + ", profession=" + profession + ", age=" + age
				+ "]";
	}



	public static void main(String[] args) {
		
		
		
		ArrayList<Flat> al = new ArrayList<Flat>();
		ArrayList<Member> ml = new ArrayList<Member>();

		
		Flat f[] = new Flat[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < f.length ; i++)
		{
			System.out.println("Enter fno,name,wing");
			f[i] = new Flat();
			f[i].setFlatno(sc.nextInt());
			f[i].setOwnername(sc.next());
			f[i].setWingA(sc.next());
			
			Member m[] = new Member[2];
			
			for(int j = 0 ; j < m.length ; j++)
			{
				System.out.println("Enter mamebr name,gender,age, proffesion");
				m[j] = new Member();
				m[j].setMembername(sc.next());
				m[j].setGender(sc.next());
				m[j].setAge(sc.nextInt());
				m[j].setProfession(sc.next());
				ml.add(m[j]);
			}
			f[i].setMemberlist(ml);
			al.add(f[i]);
		}
		
		System.out.println(al);
		
		
		for(Flat k: al)
		{
			//String name= k.get
			int cnt = 0 ;
			String nm="";
			for(Member m:ml)
			{
				if(m.getAge() >50 )
				{
					//System.out.println(m);

				}
				
				if(m.getProfession().equalsIgnoreCase("Doctor"))
				{
					cnt++;
					
				}
				nm = m.getMembername();
			}
		
		
		System.out.println(cnt);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
