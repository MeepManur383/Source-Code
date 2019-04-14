package ashwin.manur.APCSA.hw.Chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise5 {
	
	public static ArrayList<String> reverseList(ArrayList<String> list){
		ArrayList<String> reverse = new ArrayList<String>(list.size());
		for(int i = list.size() - 1; i >= 0; i--) {
			reverse.add(list.get(i));
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<>(Arrays.asList("meep", "sheep", "beep", "boop", "beep"));
		System.out.print(reverseList(list));
	}
}
