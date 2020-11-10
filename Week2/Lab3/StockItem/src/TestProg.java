import java.util.Scanner;
public class TestProg
{
	 public static void main(String[] args)
	 {
		 Scanner keyboard = new Scanner(System.in);
		 Scanner keyboardString = new Scanner(System.in);
		 String tempNumber;
		 String tempName;
		 double tempPrice;
		 
		 System.out.print("Enter the stock number: ");
		 tempNumber = keyboardString.nextLine();
		 System.out.print("Enter the name of the item: ");
		 tempName = keyboardString.nextLine();
		 System.out.print("Enter the price of the item: ");
		 tempPrice = keyboard.nextDouble();
		 
		 // Create a new item of stock using the values that were entered by the user
		 StockItem Stock = new StockItem(tempNumber, tempName, tempPrice);
		 // Increase the total number of items in stock by 5
		 Stock.increaseTotalStock(5);
		 // Display the stock number
		 System.out.printf("you have %d %s in stock%n", Stock.getTotalStock(), Stock.getName());
		 // Display the total price of all items in stock
		 System.out.printf("The total value of all the %s in stock is %f%n", Stock.getName(), Stock.calculateTotalPrice());
		 
	 }
}