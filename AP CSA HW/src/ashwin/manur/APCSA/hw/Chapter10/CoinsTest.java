package ashwin.manur.APCSA.hw.Chapter10;
import java.util.Scanner;
public class CoinsTest {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter cents: ");
		int cents = k.nextInt();
		Coins coin = new Coins(cents);
		System.out.println(coin.getQuarters() + " quarters");
		System.out.println(coin.getDimes() + " dimes");
		System.out.println(coin.getNickels() + " nickels");
		System.out.println(coin.getPennies() + " pennies");

	}
}
