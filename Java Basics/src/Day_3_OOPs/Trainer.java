package Day_3_OOPs;

public class Trainer {
	
	int trainerID;
	String TName;
	public Trainer(int trainerID, String tName) {
		super();
		this.trainerID = trainerID;
		TName = tName;
	}
	public Trainer() {
		
		
		
		
	}
	
	public int getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	
	
	

}
