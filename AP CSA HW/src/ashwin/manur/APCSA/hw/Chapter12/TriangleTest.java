package ashwin.manur.APCSA.hw.Chapter12;

public class TriangleTest {
	public static void main(String[] args) {
		Triangle equilateralTr = new EquilateralTriangle(12);
		Triangle rightTr = new RightTriangle(12);
//		System.out.println("Equilateral " + equilateralTr.getRatio());
//		System.out.println("Right isosceles " + rightTr.getRatio());
		printTriangle(rightTr);
		printTriangle(equilateralTr);
	}
	
	public static void printTriangle(Triangle triangle) {
		System.out.println(triangle);
	}

}
