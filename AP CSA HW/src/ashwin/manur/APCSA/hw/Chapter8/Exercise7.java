package ashwin.manur.APCSA.hw.Chapter8;
import java.util.Scanner;
public class Exercise7 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter ur last name, first name: ");
		String name = kboard.nextLine();
		System.out.println(convertName(name));
		kboard.close();
	}
	public static String convertName(String name) {
		String lastName = name.substring(0, name.indexOf(','));
		String firstName = name.substring(name.indexOf(',') + 2);
		return firstName + " " + lastName;
	}
}
