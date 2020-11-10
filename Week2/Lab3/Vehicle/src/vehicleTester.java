import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class vehicleTester {
	
	private String alternatives[] = {"Add", "Display", "Remove", "Exit"};
	private String newOrUsed[] = {"New", "Used"};
	private ArrayList<Vehicle> vehicles;
	
	public vehicleTester() {
		vehicles = new ArrayList<>();
	}

	/*public static void main(String[] args) {
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
	*/
	public void printMenu() {
		System.out.println("Option 1: Add a vehicle");
		System.out.println("Option 2: Display a list of vehicle details");
		System.out.println("Option 3: Delete a vehicle");
		System.out.println("Option 4: Quit!");
		System.out.println("Select from [1-4]!");
	}
	
	public Vehicle addVehicle() {
		Vehicle tempVehicle; 
		//System.out.print("Is the vehicle new(n) or secondhand(s)?");
		//Scanner sc = new Scanner(System.in);
		//Scanner ssc = new Scanner(System.in);
		int choice = JOptionPane.showOptionDialog(null, "Is the car new or used?","Vehicle menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, newOrUsed, newOrUsed[0]);
		//char choice = sc.next().charAt(0);
		//System.out.print("Registration number: ");
		//String regNo = ssc.next();
		String regNo = JOptionPane.showInputDialog(null,"Enter the Registration number:","Reg number", JOptionPane.PLAIN_MESSAGE);
		//System.out.print("Make: ");
		String make = JOptionPane.showInputDialog(null,"Enter the make:","Make", JOptionPane.PLAIN_MESSAGE);
		//System.out.print("Manufacture Year: ");
		int year = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Year the car was made:","Year", JOptionPane.PLAIN_MESSAGE));
		//System.out.print("value: ");
		double value = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of the car:","Value", JOptionPane.PLAIN_MESSAGE));
		if (choice == 0) {
			tempVehicle = new Vehicle(regNo, make, year, value);
			return tempVehicle;
		}
		else {
			//System.out.print("Total owners: ");
			int owners = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the amount of owners this car has had:","Owners", JOptionPane.PLAIN_MESSAGE));
			tempVehicle = new SecondHandVehicle(regNo, make, year, value, owners);
			return tempVehicle;
		}
	}
	
	 public void runMenu()
     {
        
        int option = getChoice();
        while (option != 3)
        {
        	switch(option) {
			case(0):
				vehicles.add(addVehicle());
				break;
			case(1):
				System.out.println("-----------Printing details!-----------");
				for (int i=0; i<vehicles.size(); i++) {
					System.out.println("\n\nVehicle nr:" + i);
					System.out.println(vehicles.get(i));
				}
				break;
			case(2):
				//System.out.print("Which vehicle would you like to remove? (tip: print details to get vehicle ID: ");
				int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Which vehicle would you like to remove?\n (tip: print details to get vehicle ID: ","Remove", JOptionPane.PLAIN_MESSAGE));
				vehicles.remove(id);
				break;
			case(3):
				System.out.println("Exiting program!");
				break;
			default:
				System.out.println("Enter a number between 1-4");
				break;
		}
         option = getChoice();
        }//End while
     }
    
    public int getChoice()
    {
        int choice = JOptionPane.showOptionDialog(null, "Select from ..","Vehicle Menu",
                     JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alternatives, alternatives[0]);
        return choice;
    }
	
}


