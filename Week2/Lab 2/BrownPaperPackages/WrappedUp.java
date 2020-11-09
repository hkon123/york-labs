import java.util.Scanner;
/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version (a version number or a date)
 */

public class WrappedUp
{
	
	public void guessMyFavouriteThing()
	{
		Scanner sc = new Scanner(System.in);
	   //Create a string object with your favourite animal, car ..whatever
	   //e.g String favMotorBikeManufacturer = "bmw"
		String favThing = "Snus";
	   
	   /* Now prompt for a guess - using the Scanner class
	    * 
	   ** Using String methods, you should give the length 
	   ** and first letter of your favourite thing in the prompt.
	   */
		System.out.printf("Guess my favourite thing! It starts with an %s and has %d characters: ",favThing.charAt(0), favThing.length());
		String guess = sc.next();
	  // Now test if the guess was correct - ignore case 
		if (favThing.equalsIgnoreCase(guess)) {
			System.out.printf("Correct! My favourite thing is: %s%n", guess);
		}
		else {
			System.out.println("WRONG!");
		}
	
	
	
	}//end guessing


	public static void main(String args[]) {
		//Create WrappedUp object and test the methods
		WrappedUp wu = new WrappedUp();
		wu.guessMyFavouriteThing();
	}
}
