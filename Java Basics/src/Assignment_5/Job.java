package Assignment_5;

public class Job {
	
	private int id;
	private String profile;
	private JoiningDate jd;
	
	public Job() {


	}

	public Job(int id, String profile, JoiningDate jd) {
		super();
		this.id = id;
		this.profile = profile;
		this.jd = jd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public JoiningDate getJd() {
		return jd;
	}

	public void setJd(JoiningDate jd) {
		this.jd = jd;
	}
	
	
	

}
