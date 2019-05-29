package APCSA.project;
import java.util.Arrays;
public class Test {
	public static String[][] findOccupiedPoints(int x, int y, int diam) {
		String[][] points = new String[diam][diam];
		for(int r = 0; r < diam; r++) {
			for(int c = 0; c < diam; c++) {
				points[r][c] = "" + (x + r) + "," + (y + c);
			}
		}
		return points;
	}
	public static void main(String[] args) {
		//System.out.println(Arrays.deepToString(findOccupiedPoints(10, 10, 15)));
	}
}
