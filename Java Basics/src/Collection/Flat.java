package Collection;

import java.util.List;

public class Flat {
	
	int flatno;
	String ownername;
	String WingA;
	List<Member> memberlist;

	public Flat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flat(int flatno, String ownername, String wingA, List<Member> memberlist) {
		super();
		this.flatno = flatno;
		this.ownername = ownername;
		WingA = wingA;
		this.memberlist = memberlist;
	}

	public int getFlatno() {
		return flatno;
	}

	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getWingA() {
		return WingA;
	}

	public void setWingA(String wingA) {
		WingA = wingA;
	}

	public List<Member> getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}

	@Override
	public String toString() {
		return "Flat [flatno=" + flatno + ", ownername=" + ownername + ", WingA=" + WingA + ", memberlist=" + memberlist
				+ "]";
	}
	


}
