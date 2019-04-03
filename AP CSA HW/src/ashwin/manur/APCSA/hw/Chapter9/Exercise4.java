package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise4 {
	public static boolean scores(int[] scores) {
		if(scores[0] == scores[scores.length - 1])
			return true;
		return false;
	}
	public static void main(String[] args) {
		int[] temp = {2, 2, 1};
		System.out.print(scores(temp));
	}
}
