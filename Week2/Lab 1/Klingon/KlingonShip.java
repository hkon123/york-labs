import java.util.Scanner;
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	
	
	public void displayKlingonDetails() {
		System.out.printf("Photon Power:    \t%f%n", photonPower);
		System.out.printf("Threat Factor:   \t%d%n", threatFactor);
		System.out.printf("Cosmic Proximity:\t%f%n", cosmicProximity);
		System.out.printf("Danger Level:    \t%f%n", getDangerLevel());
	}
	
	public double getDangerLevel() {
		return (photonPower*threatFactor)/cosmicProximity;
	}
	
	public void promptSettings() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input new Photon Power value: ");
		photonPower = sc.nextDouble();
		System.out.print("input new Threat Factor value: ");
		threatFactor = sc.nextInt();
		System.out.print("input new Cosmic Proximity value: ");
		cosmicProximity = sc.nextDouble();
	}
}
