package ashwin.manur.APCSA.hw.Chapter12;

public class EquilateralTriangle extends Triangle{

	public EquilateralTriangle(double side) {
		super(side);
	}
	
	public double getArea() {
		return Math.sqrt(3) / 4 * this.getSide() * this.getSide();
	}
	
	public double getPerimeter() {
		return 3 * this.getSide();
	}
	
	@Override
	public String toString() {
		return "Equilateral triangle: " + getSide();
	}
	

	
	
}
