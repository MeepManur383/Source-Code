package ashwin.manur.APCSA.hw.Chapter10;

public class LocationTest {
	public static void main(String[] args) {
		Location loc1 = new Location(0,0);
		Location loc2 = new Location(1,2);
		System.out.print(Location.distance(loc1, loc2));
	
	}
}
