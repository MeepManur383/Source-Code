package ashwin.manur.APCSA.hw.Chapter11;

import java.util.*;

public class Exercise6 {
	public static ArrayList<Integer> removeLeast(ArrayList<Integer> list) {
		int least = list.get(0);
		int leastInd = 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).compareTo(least) < 0) {
				least = list.get(i);
				leastInd = i;
			}
		}
		list.remove(leastInd);
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
		System.out.println(removeLeast(list));
	}
}
