import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
  private static int rnd_number;


  public static void main(String[] args) {
    // pick a random number
    Random random = new Random();
    rnd_number = random.nextInt(100) + 1;
    System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
    System.out.println( "Can you guess what it is?...");
    makeAGuess();
  }


  private static void makeAGuess() {
    Scanner scan = new Scanner(System.in); // Create a Scanner object
    //use hasNextDouble to check if input is numeric,
    // if so...

    // Checking if scanner recieves a double
    if (scan.hasNextDouble()) {

      double guess = scan.nextDouble(); //Stores user input in guess variable.
      int intGuess = (int) guess; //converting double to an int.
      System.out.println("Valid input");
      if (rnd_number == intGuess) {
        System.out.println("You've guessed correctly! \nClosing program now");
        scan.close();
      } else if(rnd_number>intGuess) {
        System.out.println("Wrong answer! Try again. Hint: the number is bigger");
        makeAGuess();
      } else {
        System.out.println("Wrong answer! Try again. Hint: the number is lower");
        makeAGuess(); 
      }
    } else {
      System.out.println("Invalid. Please input a double!");
      makeAGuess();
    }

    //   Compare it with the random number
    //   Let the user know the result of the comparison
    //   Let the user try again by calling this method recursively
    //   Help the user by revealing wether the guess was lower or higher than the target number
    // if input was not numeric show an error message and call this method recursively
  }
}
