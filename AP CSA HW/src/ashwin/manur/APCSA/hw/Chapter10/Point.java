package ashwin.manur.APCSA.hw.Chapter10;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
}
