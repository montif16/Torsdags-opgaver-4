import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		System.out.println("Please type your name");
		Scanner scan = new Scanner(System.in);
		String nameAnswer = scan.nextLine();
		System.out.println("Hello there "+nameAnswer+"\n");
		System.out.println("Please type your age");
		String ageInput = scan.nextLine();
		int ageAnswer = Integer.parseInt(ageInput);
		System.out.println("You are "+ageAnswer+" years old");
		int retirement = 67;
		System.out.println("You can retire in "+(retirement-ageAnswer)+"years");
		scan.close();

	}
}