import java.util.ArrayList;
import java.util.Scanner;
class GameMenu {

private ArrayList<String> actions = new ArrayList<String>(); //Add Arraylist called actions


public GameMenu(ArrayList<String> actions){
	this.actions = actions;

	}
public void displayMenu(){
	for(String option : actions)
		System.out.println(option);
	}

public String getAction() {
        Scanner scan = new Scanner(System.in);
        displayMenu();
        System.out.println("Type a number to choose an action");
        
        // Check if there is input available
        if (scan.hasNextLine()) {
            String choice = scan.nextLine();
            return choice;
        } else {
            // If no input available, handle it gracefully
            System.out.println("No input available");
            return null;
        }
    }



/*public String getAction(){
Scanner scan = new Scanner(System.in);
	displayMenu();
	System.out.println("Type a number to choose an action");
	String choice = scan.nextLine();
	int optionResult = Integer.parseInt(choice);
	System.out.println(actions.get(optionResult-1));
	scan.close();

	return choice;
	}
	*/
}