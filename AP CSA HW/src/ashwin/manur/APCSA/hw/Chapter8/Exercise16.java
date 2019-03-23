package ashwin.manur.APCSA.hw.Chapter8;
/*If two strings, s1 and s2, represent positive integers n1 and n2 in the usual way,
as sequences of decimal digits, it is NOT true that the sign of s1.compareTo(s2)
is always the same as the sign of (n1 - n2)!*/

public class Exercise16 {
	public static void main(String[] args) {
		System.out.println("Lets run an experiment a bunch of times to see what we get");
		System.out.println("integers n1 and n2 are set to a random number from 1-100, and s1 and s2 have each value, respectively");

		for(int i = 0; i < 1000; i++) {
			int n1 = (int)(Math.random() * 100);
			int n2 = (int)(Math.random() * 100);
			String s1 = "" + n1;
			String s2 = "" + n2;
			if(s1.compareTo(s2) >= 0 && n1 - n2 >= 0)
				System.out.println("n1 = " + n1 + ", n2 = " + n2 + "| s1.compareTo(s2) is positive and n1 - n2 is also positive");
			if(s1.compareTo(s2) >= 0 && n1 - n2 < 0)
				System.out.println("n1 = " + n1 + ", n2 = " + n2 + "| s1.compareTo(s2) is positive and n1 - n2 is negative");
			if(s1.compareTo(s2) < 0 && n1 - n2 >= 0)
				System.out.println("n1 = " + n1 + ", n2 = " + n2 + "| s1.compareTo(s2) is negative and n1 - n2 is positive");
			if(s1.compareTo(s2) < 0 && n1 - n2 < 0)
				System.out.println("n1 = " + n1 + ", n2 = " + n2 + "| s1.compareTo(s2) is negative and n1 - n2 is also negative");
			System.out.println();
		}
		System.out.println("Clearly, sometimes they are not the same time. this happens when the first unicode value of the first digit of");
		System.out.println("n1 is greater than the unicode value of the first digit of n2, but numerically, n2 is actually larger than n1.");
		System.out.println("So, if n1 = 93 and n2 = 119, the first digit going left to right is larger in n1, but numerically n2 is larger");

	}
}
