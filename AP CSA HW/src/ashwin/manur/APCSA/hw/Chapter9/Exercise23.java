package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise23 {
	public static boolean isMedian(double[] sample, double m) {
		int gCount = 0;
		int lCount = 0;
		for(double i : sample) {
			if(i < m) {
				lCount++;
			}
			if(i > m) {
				gCount++;
			}
		}
		if(gCount == lCount) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		double[] sample = {2, 2, 3, 3, 2, 4, 5};
		System.out.print(isMedian(sample, 3));
	}
}
