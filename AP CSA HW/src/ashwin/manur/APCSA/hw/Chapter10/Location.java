package ashwin.manur.APCSA.hw.Chapter10;

public class Location {
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getRow() {
		return y;
	}
	
	public int getCol() {
		return x;
	}
	
	public static int distance(Location loc1, Location loc2) {
		int colDiff = Math.abs(loc1.x - loc2.x);
		int rowDiff = Math.abs(loc1.y - loc2.y);
		int dist = Math.max(colDiff, rowDiff);
		return dist;
	}
	
}
