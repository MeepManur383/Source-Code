package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise23 {
	public static boolean isMedian(double[] sample, double m) {
		int gCount = 0;
		int lCount = 0;
	      if(sample == null || sample.length == 0) {
	    	  return false;
	      }

		for(double iVal : sample) {
			if(iVal < m) {
				lCount++;
			}
			if(iVal > m) {
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
		
		double[] sample = {2,2,3,3,4,5};
		System.out.println(isMedian(sample, 3));
		System.out.println(isMedian(null, 3));


	}
}
  