package ashwin.manur.APCSA.hw.Chapter7;

public class Exercise1 {
	public static void main(String[] args) {
		int n = 10000;
		int k = 1;
		double sum = 0;
		while(k <= n) {
			sum += 1.0 / (k * k);
			k++;
		}
		double computed = (Math.PI * Math.PI) / 6;
		System.out.println("Calculated value is " + sum);
		System.out.println("Pi^2 over 6 is actually " + computed);
		System.out.println("The difference is " + (computed - sum));
	}

}
