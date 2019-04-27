package ashwin.manur.APCSA.hw.Chapter12;

public class RightTriangle extends Triangle{

	public RightTriangle(double side) {
		super(side);
	}
	
	public double getArea() {
			return this.getSide() * this.getSide() / 2;
	}
	
	public double getPerimeter() {
		return (2 + Math.sqrt(2.0)) * this.getSide();
	}
	
	@Override
	public String toString() {
		return "Right triangle: " + getSide();
	}

}
