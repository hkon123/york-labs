import java.util.ArrayList;


public class Apartment {

	private ArrayList<Oblong> rooms = new ArrayList<>();
	
	public void add(Oblong room) {
		rooms.add(room);
	}
	
	public double getRoomArea(int index) {
		if (index>rooms.size()) {return -999;}
		else {
			return rooms.get(index).calculateArea();
		}
	}
	
	public double getRoomLength(int index) {
		if (index>rooms.size()) {return -999;}
		else {
			return rooms.get(index).getLength();
		}
	}
	
	public double getRoomHeight(int index) {
		if (index>rooms.size()) {return -999;}
		else {
			return rooms.get(index).getHeight();
		}
	}
}
