package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise5 {
	public static char getRandomRps() {
		char[] rps = {'r', 'r' ,'r', 'p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's', 's'};
		return rps[(int)(Math.random() * rps.length)];
	}
	public static void main(String[] args) {
		System.out.print(getRandomRps());
	}
}
