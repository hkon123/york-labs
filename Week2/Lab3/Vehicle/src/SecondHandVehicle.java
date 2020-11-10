
public class SecondHandVehicle extends Vehicle {
	
	private int numberOfOwners;
	
	public SecondHandVehicle(String regNoIn, String makeIn, int yomIn, double valueIn, int owners) {
		super(regNoIn, makeIn, yomIn, valueIn);
		numberOfOwners = owners;
	}
	
	public int getNumberOfOwners() {
		return numberOfOwners;
	}
	
	public boolean hasMultipleOwners() {
		if (getNumberOfOwners()>1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "Regnr: " + getRegNo() + "\n" + "Make: " + getMake() + "\n" + "Manufactured in: " 
				+ getYearOfManufacture() + "(age: " + calculateAge() +")\n" + "value: " + getValue() + "\n" 
				+ "number of owners: " + numberOfOwners + "\n"; 
	}
	
}
