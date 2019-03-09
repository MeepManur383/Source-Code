package ashwin.manur.APCSA.hw.Chapter6;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("2009: " + isLeapYear(2009));
		System.out.println("2400: " + isLeapYear(2400));
		System.out.println("2300: " + isLeapYear(2300));
		System.out.println("2004: " + isLeapYear(2004));


	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}
	
}
