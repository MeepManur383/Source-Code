package ashwin.manur.APCSA.hw.Chapter7;

public class Exercise2 {
	public static void main(String[] args) {
		int n = 10000;
		int k = 1;
		boolean isPos = true;
		double sum = 0;
		while (k <= n) {
			if(isPos) {
				sum += 1.0/k;
			}
			else {
				sum -= 1.0/k;
			}
			k++;
			isPos = !isPos;
				
		}
		System.out.println("Calculated value is " + sum);
		System.out.println("Math.log(2) value is " + Math.log(2));
		System.out.println("The difference is " + (Math.log(2) - sum));
	}
}
