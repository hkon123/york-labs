import java.util.ArrayList;
import java.util.Scanner;



public class vehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option =-1;
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------------Vehicle Storage Program------------");
		do {
			printMenu();
			option = sc.nextInt();
			switch(option) {
				case(1):
					vehicles.add(addVehicle());
					break;
				case(2):
					System.out.println("-----------Printing details!-----------");
					for (int i=0; i<vehicles.size(); i++) {
						System.out.println("\n\nVehicle nr:" + i);
						System.out.println(vehicles.get(i));
					}
					break;
				case(3):
					System.out.print("Which vehicle would you like to remove? (tip: print details to get vehicle ID: ");
					int id = sc.nextInt();
					vehicles.remove(id);
					break;
				case(4):
					System.out.println("Exiting program!");
					break;
				default:
					System.out.println("Enter a number between 1-4");
					break;
			}
			
		} while (option!=4);
	}
	
	public static void printMenu() {
		System.out.println("Option 1: Add a vehicle");
		System.out.println("Option 2: Display a list of vehicle details");
		System.out.println("Option 3: Delete a vehicle");
		System.out.println("Option 4: Quit!");
		System.out.println("Select from [1-4]!");
	}
	
	public static Vehicle addVehicle() {
		Vehicle tempVehicle; 
		System.out.print("Is the vehicle new(n) or secondhand(s)?");
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		System.out.print("Registration number: ");
		String regNo = ssc.next();
		System.out.print("Make: ");
		String make = ssc.next();
		System.out.print("Manufacture Year: ");
		int year = sc.nextInt();
		System.out.print("value: ");
		double value = sc.nextDouble();
		if (choice == 'n' || choice == 'N') {
			tempVehicle = new Vehicle(regNo, make, year, value);
			return tempVehicle;
		}
		else {
			System.out.print("Total owners: ");
			int owners = sc.nextInt();
			tempVehicle = new SecondHandVehicle(regNo, make, year, value, owners);
			return tempVehicle;
		}
	}
	
}


