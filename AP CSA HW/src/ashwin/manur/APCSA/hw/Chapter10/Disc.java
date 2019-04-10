package ashwin.manur.APCSA.hw.Chapter10;

public class Disc {
	private Point center;
	private double radius;
	
	public Disc() {
		center = new Point(0, 0);
		radius = 1;
	}
	
	public Disc(Disc disc) {
		this.center = new Point(disc.center);
		this.radius = disc.radius;
	}
}
