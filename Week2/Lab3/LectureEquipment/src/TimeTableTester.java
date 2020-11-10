
public class TimeTableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeTable table = new TimeTable(5, 7);
		table.makeBooking(1, 1, new Booking("room 1", "Hakon"));
		System.out.println(table.isFree(1, 1));
		Booking booking = table.getBooking(1, 1);
		System.out.printf("the room %s is booked by %s on day %d, period %d", booking.getRoom(), booking.getName(), 1, 1);
	}

}
