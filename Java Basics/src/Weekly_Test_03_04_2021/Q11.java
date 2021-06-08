package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Scanner;

class Player{
	
	
	int playerID;
	String name;
	String county;
	String team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Player(int playerID, String name, String county, String team) {
		super();
		this.playerID = playerID;
		this.name = name;
		this.county = county;
		this.team = team;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", name=" + name + ", county=" + county + ", team=" + team + "]";
	}
	
	
	
	
	
}
public class Q11 {

	public static void main(String[] args) {

		Player [] p = new Player[5];
		ArrayList<Player> al = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ;  i <p.length  ; i++)
		{
			p[i] = new Player(sc.nextInt(), sc.next(), sc.next(), sc.next());
			
			al.add(p[i]);
		}
		
		int max = 0 ;
		String teamMaxString="";
		
		
		
		
		
		
		for(Player team : al)
		{
			
			int cnt=0;
			
			String teamName = team.getTeam();
			
			if(!teamMaxString.equalsIgnoreCase(teamName)) {
			
					for (Player country:al)
					{
						if(country.getTeam().equalsIgnoreCase(teamName) && country.getCounty().equalsIgnoreCase("aus"))
						{
							cnt++;
						}
					}
			
					if(cnt>max)
					{
						max = cnt;
						teamMaxString = teamName;
				
					}
			
				}
		}
		
		System.out.println(teamMaxString);
		System.out.println(max);
		
		
		
		
		
//		
//		for(int i = 0 ; i < al.size() ; i++)
//		{
//			String team = al.get(i).getTeam();
//			int cnt=0;
//			
//			for(int j = i+1 ; j < al.size() ; j++)
//			{
//			
//					if(al.get(i).getTeam().equalsIgnoreCase(team) && al.get(j).getCounty().equalsIgnoreCase("aus"))
//					{
//							//System.out.println();
//							//System.out.println(al.get(i));
//							//team = al.get(i).getTeam();
//							//max++;
//							cnt++;
//					}	
//				
//			}
//			
//			if(cnt>max) 
//			{
//				max 		  = cnt;
//				teamMaxString = team;
//			}
//			
//		}
//		
		System.out.println(teamMaxString);
		System.out.println(max);
																`
		
		
		
	
		
		
		
		
		
		
		
	

}
