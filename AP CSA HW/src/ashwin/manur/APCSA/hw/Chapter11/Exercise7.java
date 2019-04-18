package ashwin.manur.APCSA.hw.Chapter11;
import java.util.*;
public class Exercise7 {
	public static void filter(ArrayList<Object> list1, ArrayList<Object> list2) {
		int list1Ind = 0;
		while(list1Ind < list1.size()) {
			boolean found = false;
			for(int list2Ind = 0; list2Ind < list2.size(); list2Ind++) {
				if(list1.get(list1Ind) == list2.get(list2Ind)) {
					found = true;
					break;
				}				
			}
			if(found)
				list1.remove(list1Ind);
			else
				list1Ind++;
		}
	}
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>(Arrays.asList(1, 2, 4));
		ArrayList<Object> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
		filter(list, list2);
		System.out.println("List1: " + list);
		System.out.println("List2: " + list2);

	}
}
