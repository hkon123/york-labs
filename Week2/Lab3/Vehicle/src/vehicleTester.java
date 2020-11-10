
public class vehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondHandVehicle toyota = new SecondHandVehicle("AB 123456", "Toyota", 2005, 25000, 3);
		System.out.println(toyota.calculateAge());
		System.out.println(toyota.hasMultipleOwners());
		System.out.println(toyota.getMake());
	}

}
