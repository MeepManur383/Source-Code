package ashwin.manur.APCSA.hw.Chapter10;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 6);
		System.out.println(rect.isSquare());
		System.out.println(rect.getWidth() + ", " + rect.getHeight());
		rect.quadratize();
		System.out.println(rect.getWidth() + ", " + rect.getHeight());
		System.out.println();
		Rectangle rect2 = new Rectangle(3);
		System.out.println(rect2.isSquare());
		System.out.println(rect2.getWidth() + ", " + rect2.getHeight());
		rect2.quadratize();
		System.out.println(rect2.getWidth() + ", " + rect2.getHeight());
	}
}
