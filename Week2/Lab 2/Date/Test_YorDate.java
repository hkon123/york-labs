// File: Test_YorDate.java
/**
 * Test harness for YorDate class
 *
 * @author	Tommy Yuan
 * @version	24 January 2019 */
 
public class Test_YorDate
{
	public static void main(String args[])
	{
		//Create a reference to a YorDate object
		YorDate date1, date2;
			
	    // This creates an object which sets the date to the current date
		 date1 = new YorDate(21, 6, 1995);
		 date2 = new YorDate(24, 11, 1962);
		
		//Using the appropriate methods set, set date1 to your birthdate
		 System.out.printf("You were born on %s%n", date1.getDayOfWeek());
		
		 System.out.printf("Your dad was born %d days before you%n", date2.daysBetween(date1));
		//Using appropriate date1 method(s) display your birthday
		
		
	}
}