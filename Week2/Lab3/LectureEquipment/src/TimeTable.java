import java.util.ArrayList;

public class TimeTable {

	ArrayList<ArrayList<Booking>> times;
	
	public TimeTable(int daysIn, int periodsIn) 
	{
		times = new ArrayList<>();
		for (int i=0 ; i<daysIn ; i++) 
		{
			times.add(new ArrayList<Booking>());
			for (int j=0 ; j<periodsIn ; j++) 
			{
				times.get(i).add(new Booking());
			}
		}
	}
	
	public boolean makeBooking(int day, int period, Booking book) {
		if ( isFree(day, period)) {
			times.get(day).get(period).bookRoom(book.getRoom(), book.getName());
			return true;
		}
		else { 
			return false;
		}
	}
	public boolean cancelBooking(int day, int period) {
		if ( !isFree(day, period)) {
			times.get(day).get(period).cancelRoom();
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFree(int day, int period) {
		if ( times.get(day).get(period).getStatus()) {
			return true;
		}
		else { 
			return false;
		}
	}
	
	public Booking getBooking(int day, int period) {
		Booking temp = null;
		if (!isFree(day, period)) {
			temp = times.get(day).get(period);
			return temp;
		}
		else {
			return temp;
		}
	}
	
	public int numberOfDays() {
		return times.size();
	}
	
	public int numberOfPeriods() {
		return times.get(0).size();
	}
	
}
