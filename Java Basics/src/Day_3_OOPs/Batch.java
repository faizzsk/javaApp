package Day_3_OOPs;

public class Batch {

	int batchID;
	String batchName;
	Trainer t ;
	
	
	public Batch() {
	
	}
	
	public Batch(int batchID, String batchName, Trainer t) {
		super();
		this.batchID = batchID;
		this.batchName = batchName;
		this.t = t;
	}
	
	public int getBatchID() {
		return batchID;
	}
	
	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}
	
	public String getBatchName() {
		return batchName;
	}
	
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	
	
	
}
