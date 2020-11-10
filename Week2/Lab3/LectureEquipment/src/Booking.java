
public class Booking {
	private String room, name;
	private boolean isFree;
	
	public Booking() {
		isFree = true;
	}
	
	public Booking(String roomIn, String nameIn) {
		room = roomIn;
		name = nameIn;
		isFree = false;
	}
	
	public String getRoom() {
		return room;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getStatus() {
		return isFree;
	}
	
	public void bookRoom(String roomIn, String nameIn) {
		room = roomIn;
		name = nameIn;
		isFree = false;
	}
	public void cancelRoom() {
		room = null;
		name = null;
		isFree = true;
	}
}
