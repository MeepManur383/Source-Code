package ashwin.manur.APCSA.hw.Chapter10;

public class Time {
	private int hours;
	private int mins;
	
	public Time(int hours, int mins) {
		if(hours < 24 && mins < 60 && hours >= 0 && mins >= 0) {
			this.hours = hours;
			this.mins = mins;	
		}
		else {
			throw new IllegalArgumentException("Hours must be less than 24 and Minutes must be less than 60!");
		}
	}
	private int toMins() {
		return hours * 60 + mins;
	}
	
	public boolean lessThan(Time t) {
		 return (toMins() < t.toMins());
	}
	
	public int elapsedSince(Time t) {
		if(this.hours < t.hours) {
			return (24 * 60 + toMins() - t.toMins());
		}
		else {
			return t.toMins() - toMins();
		}
	}
	
	@Override
	public String toString() {
		return(hours + ":" + mins);
	}
	
}
