import java.util.ArrayList;

class Main{


	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1: Start game");
		actions.add("2: Resume game");
		actions.add("3: Pause game");
		actions.add("4: End game");
		//System.out.print(actions.get(2)); // expected output: "Pause game"
		GameMenu menu = new GameMenu(actions);
		String userChoice = menu.getAction();
		int userChoiceToInt = Integer.parseInt(userChoice);
		//menu.getAction();
		doAction(userChoiceToInt);

	}
	
	public static void doAction(int action){

		switch(action){
			case 1:
			System.out.println("Starting the game now");
			break;

			case 2:
			System.out.println("Fetching previously saved game data");
			break;

			case 3:
			System.out.println("Game paused");
			break;

			case 4:
				System.out.println("Ending game");
				break;
			default:
				System.out.println("invalid choice, please pick a valid option");
				
		}
	}
}
