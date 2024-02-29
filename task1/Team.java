import java.util.ArrayList;

class Team {
	String teamName = "";
	int rank = 0;
	ArrayList<String> memberNames;

	public Team(String teamName){
		this.teamName = teamName;


	}
	public void setRank(int newRank){
		this.rank = newRank;
	}
	@Override
	public String toString(){
		return "Hold: " + teamName + " rang: " + rank;
	}
}