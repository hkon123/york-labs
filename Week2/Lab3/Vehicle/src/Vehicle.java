
public class Vehicle {

	private String regNo, make;
	private int yearOfManufacture;
	private double value;
	private final int currYear = 2020;
	
	public Vehicle(String regNoIn, String makeIn, int yomIn, double valueIn) {
		regNo = regNoIn;
		make = makeIn;
		yearOfManufacture = yomIn;
		value = valueIn;
	}
	
	public String getRegNo() {
		return regNo;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double valueIn) {
		value = valueIn;
	}
	
	public int calculateAge() {
		return currYear - yearOfManufacture;
	}
	
	public String toString() {
		return "Regnr: " + regNo + "\n" + "Make: " + make + "\n" + "Manufactured in: " 
				+ yearOfManufacture + "(age: " + calculateAge() +")\n" + "value: " + value + "\n"; 
	}
}
