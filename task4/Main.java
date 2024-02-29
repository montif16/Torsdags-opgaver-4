import java.util.ArrayList;

class Main{

	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");
		//System.out.print(actions.get(2)); // expected output: "Pause game"
		GameMenu menu = new GameMenu(actions);
		 menu.displayMenu();
	}
}