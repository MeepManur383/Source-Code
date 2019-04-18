package ashwin.manur.APCSA.hw.Chapter11;

import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(new String("meep"));
		arr.add(arr);
		// iterate through the arraylist
		for (int i = 0; i < arr.size(); i++) {
			if (arr.equals(arr.get(i))) {
				System.out.println("Success");
			}
		}

	}
}
