import java.util.ArrayList;
class GameMenu {

private ArrayList<String> actions = new ArrayList<String>(); //Add Arraylist called actions

public GameMenu(ArrayList<String> actions){
	this.actions = actions;

	}
public void displayMenu(){
	for(String option : actions)
		System.out.println(option);
	}

}