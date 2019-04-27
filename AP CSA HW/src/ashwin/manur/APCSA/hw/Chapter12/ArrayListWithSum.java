package ashwin.manur.APCSA.hw.Chapter12;

import java.util.ArrayList;

public class ArrayListWithSum extends ArrayList<Integer> implements ListWithSum{

	@Override
	public int sum() {
		int sum = 0;
		for(Integer ival : this) {
			sum += ival;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayListWithSum list = new ArrayListWithSum();
		list.add(10);
		list.add(2);
		list.add(13);
		list.add(19);
		list.add(0);
		list.add(-4);
		
		System.out.println(list.sum());
	}
	
}
